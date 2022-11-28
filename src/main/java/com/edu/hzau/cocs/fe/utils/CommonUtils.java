package com.edu.hzau.cocs.fe.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.stereotype.Component;

/**
 * @Author yue
 */
@Slf4j
@Component
public class CommonUtils {
    public String getQuestion(String datalog) {
        if (datalog.contains("Q1")) {
            return "Q1";
        } else if (datalog.contains("Q2")) {
            return "Q2";
        } else if (datalog.contains("Q3")) {
            return "Q3";
        } else {
            return "Q4";
        }
    }
}
