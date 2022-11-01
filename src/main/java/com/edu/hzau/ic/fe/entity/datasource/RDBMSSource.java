package com.edu.hzau.ic.fe.entity.datasource;

import fr.lirmm.graphik.graal.store.rdbms.driver.AbstractRdbmsDriver;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RDBMSSource extends Source {

    private String ruleFilePath;
    private AbstractRdbmsDriver driver;

    public RDBMSSource(String sourceName, String sourceType, String ruleFilePath, AbstractRdbmsDriver driver){
        super(sourceName, null, sourceType, null, null);
        this.ruleFilePath = ruleFilePath;
        this.driver = driver;
    }
}
