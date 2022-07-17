package com.edu.hzau.ic.fe.utils;

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author yue
 */

@Component
public class DateUtils {
    public double getDate() {
        return System.currentTimeMillis();
    }
}
