package com.sogal.wx.core.tool;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by xiaoxuwang on 2019/4/25.
 */
public enum DateTool implements AbstractDateTool{


    TODAY{
        @Override
        public String getDate(String pattern) {
            return formatTime(LocalDateTime.now(), pattern);
        }
    },
    YESTERDAY{
        @Override
        public String getDate(String pattern) {
            return formatTime(minu(LocalDateTime.now(), 1, ChronoUnit.DAYS), pattern);
        }
    },
    LAST_WEEK{
        @Override
        public String getDate(String pattern) {
            return formatTime(minu(LocalDateTime.now(), 7, ChronoUnit.DAYS), pattern);
        }
    },
    LAST_MONTH{
        @Override
        public String getDate(String pattern) {
            return formatTime(minu(LocalDateTime.now(), 30, ChronoUnit.DAYS), pattern);
        }
    },
    TOMORROW{
        @Override
        public String getDate(String pattern) {
            return formatTime(plus(LocalDateTime.now(), 1, ChronoUnit.DAYS), pattern);
        }
    },
    LAST_YEAR{
        @Override
        public String getDate(String pattern) {
            return formatTime(minu(LocalDateTime.now(), 1, ChronoUnit.YEARS), pattern);
        }
    };

}
