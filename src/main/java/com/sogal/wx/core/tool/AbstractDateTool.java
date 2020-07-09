package com.sogal.wx.core.tool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

/**
 * Created by xiaoxuwang on 2019/4/25.
 */
public interface AbstractDateTool {

    String getDate(String pattern);

    default String formatTime(LocalDateTime time, String pattern) {
        return time.format(DateTimeFormatter.ofPattern(pattern));
    }

    default LocalDateTime plus(LocalDateTime time, long number, TemporalUnit field) {
        return time.plus(number, field);
    }

    default LocalDateTime minu(LocalDateTime time, long number, TemporalUnit field){
        return time.minus(number,field);
    }

}
