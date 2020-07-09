package com.sogal.wx.core.tool;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

@Slf4j
public class NumberUtils {

    private static final Double MILLION = 10000.0;
    private static final Double MILLIONS = 1000000.0;
    private static final Double BILLION = 100000000.0;
    private static final String MILLION_UNIT = "w";
    private static final String BILLION_UNIT = "亿";

    /**
     * 将数字转换成以万为单位或者以亿为单位，因为在前端数字太大显示有问题
     *
     * @param amount 报销金额
     * @return
     * @author
     * @version 1.00.00
     * @date 2018年1月18日
     */
    public static String amountConversion(double amount) {
        //最终返回的结果值
        String result = String.valueOf(amount);
        //四舍五入后的值
        double value = 0;
        //转换后的值
        double tempValue = 0;
        //余数
        double remainder = 0;

        //金额大于1百万小于1亿
        if (amount >= MILLIONS && amount < BILLION) {
            tempValue = amount / MILLION;
            remainder = amount % MILLION;
            //余数小于5000则不进行四舍五入
            if (remainder < (MILLION / 2)) {
                value = formatNumber(tempValue, 1, false);
            } else {
                value = formatNumber(tempValue, 1, true);
            }
            //如果值刚好是10000万，则要变成1亿
            if (value == MILLION) {
                result = zeroFill(value / MILLION) + BILLION_UNIT;
            } else {
                result = zeroFill(value) + MILLION_UNIT;
            }
        }
        //金额大于1亿
        else if (amount >= BILLION) {
            tempValue = amount / BILLION;
            remainder = amount % BILLION;
            //余数小于50000000则不进行四舍五入
            if (remainder < (BILLION / 2)) {
                value = formatNumber(tempValue, 1, false);
            } else {
                value = formatNumber(tempValue, 1, true);
            }
            result = zeroFill(value) + BILLION_UNIT;
        }
        //金额大于1万
        else if (amount >= MILLION) {
            tempValue = amount / MILLION;
            remainder = amount % MILLION;
            //余数小于5000则不进行四舍五入
            if (0 < remainder && remainder < (MILLION / 2)) {
                value = formatNumber(tempValue, 1, false);
            } else {
                value = formatNumber(tempValue, 1, false);
            }
            //如果值刚好是10000，则要变成1万
            if (value == MILLION) {
                result = zeroFill(value / MILLION) + MILLION_UNIT;
            } else {
                result = zeroFill(value) + MILLION_UNIT;
            }
        } else {
            result = zeroFill(amount);
        }
        return result;
    }

    /**
     * 对数字进行四舍五入，保留2位小数
     *
     * @param number   要四舍五入的数字
     * @param decimal  保留的小数点数
     * @param rounding 是否四舍五入
     * @return
     * @author
     * @version 1.00.00
     * @date 2018年1月18日
     */
    public static Double formatNumber(double number, int decimal, boolean rounding) {
        BigDecimal bigDecimal = new BigDecimal(number);

        if (rounding) {
            return bigDecimal.setScale(decimal, RoundingMode.HALF_UP).doubleValue();
        } else {
            return bigDecimal.setScale(decimal, RoundingMode.DOWN).doubleValue();
        }
    }

    /**
     * 对四舍五入的数据进行补0显示，即显示.00
     *
     * @return
     * @author
     * @version 1.00.00
     * @date 2018年1月23日
     */
    public static String zeroFill(double number) {
        String value = String.valueOf(number);

        if (value.indexOf(".") < 0) {
            value = value + ".0";
        } else {
            String decimalValue = value.substring(value.indexOf(".") + 1);

            if (decimalValue.length() < 2) {
                value = value;
            }
        }
        if (value.endsWith(".0")) {
            value = value.substring(0, value.indexOf(".0"));
        }
        return value;
    }

    public static Integer yuanToFen(BigDecimal number) {
        if (number == null) {
            return null;
        }
        number = number.multiply(new BigDecimal(100)).setScale(0, RoundingMode.DOWN);// 单位分
        return Integer.parseInt(String.valueOf(number));
    }

    public static Integer getRandom(Integer min, Integer max) {
        if (min == null || max == null || min.compareTo(max) >= 0) {
            return null;
        }
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }

    public static BigDecimal fenToYuan(Integer number) {
        if (number == null) {
            return null;
        }
        return BigDecimal.valueOf(number).divide(new BigDecimal(100));// 单位元
    }

}
