package com.edu.hzau.ic.fe.service;

import com.alibaba.fastjson2.JSONArray;
import com.edu.hzau.ic.fe.entity.RDBMSSource;
import com.edu.hzau.ic.fe.entity.Source;
import com.edu.hzau.ic.fe.entity.SourceRepository;
import com.edu.hzau.ic.fe.mapper.SqlQuery;
import com.edu.hzau.ic.fe.utils.Dlgpz;
import fr.lirmm.graphik.graal.api.core.*;
import fr.lirmm.graphik.graal.core.DefaultUnionOfConjunctiveQueries;
import fr.lirmm.graphik.graal.core.ruleset.DefaultOntology;
import fr.lirmm.graphik.graal.io.dlp.DlgpParser;
import fr.lirmm.graphik.graal.backward_chaining.pure.PureRewriter;
import fr.lirmm.graphik.util.Prefix;
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
@Service
@Slf4j
public class FDAFunctions {
    public JSONArray query(String queryStr) {
        SourceRepository repo = SourceRepository.defaultInstance("FDARepo");
        try {
            Ontology onto = createRDBMSOntology(repo.getSourcePool());
            ConjunctiveQuery query = buildQuery(queryStr);
            log.info("ConjunctiveQuery ---> " + query);

            PureRewriter rewriter = new PureRewriter();
            CloseableIteratorWithoutException<ConjunctiveQuery> it = rewriter.execute(query, onto);
            UnionOfConjunctiveQueries ucq = new DefaultUnionOfConjunctiveQueries(query.getAnswerVariables(), it);
            log.info("UnionOfConjunctiveQueries ---> " + ucq);

            Collection<ConjunctiveQuery> optimisedQueries = UCQOptimisation(ucq); // 优化：根据特定存储的模式优化（optimise）连接查询的并集
            log.info("OptimisedQueries ---> " + optimisedQueries);

            String datalog= Dlgpz.writeToString(optimisedQueries);//输出查询重写后的语句
            log.info("Datalog after rewriting ---> " + datalog);

            String sqlquery = SqlTranslation.translate(datalog);
            log.info("sql ---> " + sqlquery);
            it.close();

            JSONArray jsonArray = SqlQuery.excute(sqlquery);
            return jsonArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Ontology createRDBMSOntology(Set<Source> sourcePool) throws Exception {
        Set<RDBMSSource> rdbmsSourceSet = new HashSet<RDBMSSource>();
        for (Source source : sourcePool) {
            if (source instanceof RDBMSSource) {
                rdbmsSourceSet.add((RDBMSSource) source);
            }
        }
        Set<String> prefixes = new HashSet<String>();
        Set<String> rules = new HashSet<String>();
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
    public Dlgpz createDefaultWriter() throws Exception {
        // Create a DLGP writer to print parsed ontology
        Dlgpz writer = new Dlgpz();
        writer.write("\n= 初始化 =\n");
        writer.write(new Prefix("class", "http://unisa.edu.au/KSE.owl/class#"));
        writer.write(new Prefix("attribute", "http://unisa.edu.au/KSE.owl/attribute#"));
        writer.write(new Prefix("relationship", "http://unisa.edu.au/KSE.owl/relationship#"));
        writer.write(new Prefix("", ""));
        return writer;
    }
    public ConjunctiveQuery buildQuery(String query) throws Exception {
        String prefixes = "@prefix class: <http://unisa.edu.au/KSE.owl/class#>\n"
                + "        @prefix attribute: <http://unisa.edu.au/KSE.owl/attribute#>\n"
                + "        @prefix relationship: <http://unisa.edu.au/KSE.owl/relationship#>\n"
                + "        @prefix : <>\n";
        String wholeString = prefixes + query;
        ConjunctiveQuery conjunctiveQuery = DlgpParser.parseQuery(wholeString); // 创建query（关键点）
        return conjunctiveQuery;
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
