package com.edu.hzau.ic.fe.entity;

import fr.lirmm.graphik.graal.store.rdbms.driver.AbstractRdbmsDriver;
import fr.lirmm.graphik.graal.store.rdbms.driver.MysqlDriver;

import java.util.HashSet;
import java.util.Set;

public class SourceRepository {

    private String repoName;
    private Set<Source> sourcePool;
    private static SourceRepository instance;

    public String getRepoName() {
        return repoName;
    }

    public Set<Source> getSourcePool() {
        return sourcePool;
    }

    public SourceRepository(String repoName, Set<Source> sourcePool){
        this.repoName = repoName;
        this.sourcePool = sourcePool;
    }

    // 被调用
    public SourceRepository(String repoName, boolean createDefaultPool){
        this.repoName = repoName;
        if (createDefaultPool){
//            this.sourcePool = createDefaultSourcePool(); // 跟vms、cms数据库有关
            this.sourcePool = createSwineSourcePool();
        }
    }

    public static synchronized SourceRepository emptyInstance(String repoName) {
        if (instance == null)
            instance = new SourceRepository(repoName, false);
        return instance;
    }

    // 被调用
    public static synchronized SourceRepository defaultInstance(String repoName) {
        if (instance == null)
            instance = new SourceRepository(repoName, true); // 被调用
        return instance;
    }

    public static synchronized SourceRepository instance(String repoName, Set<Source> sourcePool) {
        if (instance == null)
            instance = new SourceRepository(repoName, sourcePool);
        return instance;
    }

    public void addSource(Source s){
        this.getSourcePool().add(s);
    }

    public void removeSource(Source s){
        this.getSourcePool().remove(s);
    }

    public Set<Source> createDefaultSourcePool(){
        String root = "./datalogrules/";
        Set<Source> sourcePool = new HashSet<Source>();
        try{
            AbstractRdbmsDriver keggDriver = new MysqlDriver("jdbc:mysql://localhost:3306/kegg?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource kegg = new RDBMSSource("kegg", "mysql", root+"gut_microbiota_ontology_v1.2_q4.dlp", keggDriver);
            AbstractRdbmsDriver gutmgeneDriver = new MysqlDriver("jdbc:mysql://localhost:3306/gutmgene?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource gutmgene = new RDBMSSource("gutmgene", "mysql", root+"gut_microbiota_ontology_v1.2_q4.dlp", gutmgeneDriver);
            AbstractRdbmsDriver relDriver = new MysqlDriver("jdbc:mysql://localhost:3306/relationship?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource rel = new RDBMSSource("relationship", "mysql", root+"gut_microbiota_ontology_v1.2_q4.dlp", relDriver);
            AbstractRdbmsDriver gutmdisorderDriver = new MysqlDriver("jdbc:mysql://localhost:3306/gutmdisorder?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource gutmdisorder = new RDBMSSource("gutmdisorder", "mysql", root+"gut_microbiota_ontology_v1.2_q4.dlp", gutmdisorderDriver);
            sourcePool.add(gutmdisorder);
            sourcePool.add(gutmgene);
            sourcePool.add(kegg);
            sourcePool.add(rel);
        } catch(Exception e){
            e.printStackTrace();
        }
        return sourcePool;
    }

    public Set<Source> createSwineSourcePool(){
        String root = "./datalogrules/";
        Set<Source> sourcePool = new HashSet<>();
        try{
            AbstractRdbmsDriver fsmmDriver = new MysqlDriver("jdbc:mysql://localhost:3306/fsmm?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource fsmm = new RDBMSSource("fsmm", "mysql", root+"swine_microbiota_ontology.dlp", fsmmDriver);
            AbstractRdbmsDriver geneInfoDriver = new MysqlDriver("jdbc:mysql://localhost:3306/gene_info?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource geneInfo = new RDBMSSource("gene_info", "mysql", root+"swine_microbiota_ontology.dlp", geneInfoDriver);
            AbstractRdbmsDriver relationshipEntityDriver = new MysqlDriver("jdbc:mysql://localhost:3306/relationship_entity?user=root&password=111111&useUnicode=true&characterEncoding=utf8");
            RDBMSSource relationshipEntity = new RDBMSSource("relationship_entity", "mysql", root+"swine_microbiota_ontology.dlp", relationshipEntityDriver);
            sourcePool.add(fsmm);
            sourcePool.add(geneInfo);
            sourcePool.add(relationshipEntity);
        } catch(Exception e){
            e.printStackTrace();
        }
        return sourcePool;
    }
}
