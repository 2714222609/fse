package com.edu.hzau.ic.fe.service;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.edu.hzau.ic.fe.entity.RDBMSSource;
import com.edu.hzau.ic.fe.entity.Source;
import com.edu.hzau.ic.fe.entity.SourceRepo;
import com.edu.hzau.ic.fe.mapper.SqlQuery;
import com.edu.hzau.ic.fe.utils.Dlgpz;
import fr.lirmm.graphik.graal.api.core.ConjunctiveQuery;
import fr.lirmm.graphik.graal.api.core.Ontology;
import fr.lirmm.graphik.graal.api.core.Predicate;
import fr.lirmm.graphik.graal.api.core.UnionOfConjunctiveQueries;
import fr.lirmm.graphik.graal.backward_chaining.pure.PureRewriter;
import fr.lirmm.graphik.graal.core.DefaultUnionOfConjunctiveQueries;
import fr.lirmm.graphik.graal.core.ruleset.DefaultOntology;
import fr.lirmm.graphik.graal.io.dlp.DlgpParser;
import fr.lirmm.graphik.util.stream.CloseableIterator;
import fr.lirmm.graphik.util.stream.CloseableIteratorWithoutException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @Author yue
 */
@Slf4j
@Service
public class GraalService {

    public JSONArray query(String datalog) {
        // swine
        SourceRepo repo = SourceRepo.getSwineSourceRepo();
        // bio
//        SourceRepo repo = SourceRepo.getBioSourceRepo();
        try {
            Ontology onto = createRDBMSOntology(repo.getSourcePool());
            ConjunctiveQuery query = buildQuery(datalog);
            log.info("ConjunctiveQuery ---> " + query);

            PureRewriter rewriter = new PureRewriter();
            CloseableIteratorWithoutException<ConjunctiveQuery> it = rewriter.execute(query, onto);
            UnionOfConjunctiveQueries ucq = new DefaultUnionOfConjunctiveQueries(query.getAnswerVariables(), it);
            log.info("UnionOfConjunctiveQueries ---> " + ucq);

            Collection<ConjunctiveQuery> optimisedQueries = UCQOptimisation(ucq);
            log.info("OptimisedQueries ---> " + optimisedQueries); // 优化后的datalog

            String datalogRewrite= Dlgpz.writeToString(optimisedQueries);
            log.info("Datalog after rewriting ---> " + datalogRewrite); // 重写后的datalog

            String sqlquery = SqlTranslation.translate(datalogRewrite);
            log.info("sql ---> " + sqlquery);
            it.close();
            return SqlQuery.excute(sqlquery);

        } catch (Exception e) {
            JSONArray resultJson = new JSONArray();
            JSONObject responseInfo = new JSONObject();
            responseInfo.put("err", "You have an error in your datalog syntax.");
            resultJson.add(responseInfo);
            log.error(e.getMessage());
            return resultJson;
        }

    }

    public Ontology createRDBMSOntology(Set<Source> sourcePool) throws Exception {
        Set<RDBMSSource> rdbmsSourceSet = new HashSet<>();
        for (Source source : sourcePool) {
            if (source instanceof RDBMSSource) {
                rdbmsSourceSet.add((RDBMSSource) source);
            }
        }
        Set<String> prefixes = new HashSet<>();
        Set<String> rules = new HashSet<>();
        for (RDBMSSource source : rdbmsSourceSet) {
            String ruleFilePath = source.getRuleFilePath();
            List<String> contents = Files.readAllLines(Paths.get(ruleFilePath));
            for (String s : contents) {
                if (s.startsWith("@prefix")) {
                    prefixes.add(s);
                } else {
                    rules.add(s);
                }
            }
        }
        StringBuilder allRules = new StringBuilder();
        for (String prefix : prefixes) {
            allRules.append(prefix).append("\n");
        }
        for (String rule : rules) {
            allRules.append(rule).append("\n");
        }
        return new DefaultOntology(new DlgpParser(allRules.toString()));
    }

    public ConjunctiveQuery buildQuery(String query) throws Exception {
        String prefixes = "@prefix class: <http://unisa.edu.au/KSE.owl/class#>\n"
                + "        @prefix attribute: <http://unisa.edu.au/KSE.owl/attribute#>\n"
                + "        @prefix relationship: <http://unisa.edu.au/KSE.owl/relationship#>\n"
                + "        @prefix : <>\n";
        String wholeString = prefixes + query;
        return DlgpParser.parseQuery(wholeString);
    }

    public static Collection<ConjunctiveQuery> UCQOptimisation(UnionOfConjunctiveQueries ucq) throws Exception {
        //get a new iterator for the rewriting result
        CloseableIterator<ConjunctiveQuery> it = ucq.iterator();
        //get the optimized rewritings for db query
        ConjunctiveQuery lastConjunctiveQuery = null;
        Collection<ConjunctiveQuery> optimisedQueries = new LinkedList<>();
        while (it.hasNext()) {
            boolean match = true;
            lastConjunctiveQuery = it.next();
            Set<Predicate> cqPredicates = lastConjunctiveQuery.getAtomSet().getPredicates();
            for (Predicate p : cqPredicates) {
                String identifier = p.getIdentifier().toString();
                if (identifier.contains("#")) {
                    match = false;
                    break;
                }
            }
            if (match) {
                optimisedQueries.add(lastConjunctiveQuery);
            }
        }
        return optimisedQueries;
    }
}
