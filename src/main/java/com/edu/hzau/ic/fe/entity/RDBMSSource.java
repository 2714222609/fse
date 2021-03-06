package com.edu.hzau.ic.fe.entity;

import com.alibaba.fastjson2.JSONObject;
import fr.lirmm.graphik.graal.store.rdbms.driver.AbstractRdbmsDriver;

public class RDBMSSource extends Source {

    private final String ruleFilePath;
    private final AbstractRdbmsDriver driver;

    public String getRuleFilePath() {
        return ruleFilePath;
    }

    public AbstractRdbmsDriver getDriver() {
        return driver;
    }

    public RDBMSSource(String sourceName, String description, String sourceType, JSONObject accessInfo, JSONObject metadata, String ruleFilePath){
        super(sourceName, description, sourceType, accessInfo, metadata);
        this.ruleFilePath = ruleFilePath;
        this.driver = buildDriver(sourceType, accessInfo);
    }

    public RDBMSSource(String sourceName, String sourceType, JSONObject accessInfo, String ruleFilePath){
        super(sourceName, null, sourceType, accessInfo, null);
        this.ruleFilePath = ruleFilePath;
        this.driver = buildDriver(sourceType, accessInfo);
    }

    public RDBMSSource(String sourceName, String sourceType, String ruleFilePath, AbstractRdbmsDriver driver){
        super(sourceName, null, sourceType, null, null);
        this.ruleFilePath = ruleFilePath;
        this.driver = driver;
    }

    public AbstractRdbmsDriver buildDriver(String sourceType, JSONObject accessInfo){
        //TO DO
        return null;
    }



}
