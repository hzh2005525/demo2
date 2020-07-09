package com.sogal.wx.core.tool;

import lombok.Getter;

@Getter
public class Radix {
    private final static char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'A' , 'B' ,
            'C' , 'D' , 'E' , 'F' , 'G' , 'H' ,
            'I' , 'J' , 'K' , 'L' , 'M' , 'N' ,
            'O' , 'P' , 'Q' , 'R' , 'S' , 'T' ,
            'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' ,
            'a' , 'b' , 'c' , 'd' , 'e' , 'f' ,
            'g' , 'h' , 'i' , 'j' , 'k' , 'l' ,
            'm' , 'n' , 'o' , 'p' , 'q' , 'r' ,
            's' , 't' , 'u' , 'v' , 'w' , 'x' ,
            'y' , 'z' , '+' , '/', '[' , ']'
    };

    private static final int ASCII_SIZE = 128;

    private static final int[] DIGITS_INDEX = new int[ASCII_SIZE];

    private static final char BLANK_CHAR = '0';

    /**
     * 进制数
     */
    @Getter
    protected int radix;

    /**
     * 空白补充字符
     */
    @Getter
    protected char blankChar;

    public static final int MAX_RADIX = 66;

    public static final int MIN_RADIX = 2;

    /**
     * 进制最大的字符
     */
    @Getter
    protected char maxChar;

    static {
        for (int i = 0; i < ASCII_SIZE; i++) {
            DIGITS_INDEX[i] = -1;
        }
        for (int i = 0; i < digits.length; i++) {
            DIGITS_INDEX[digits[i]] = i;
        }
    }

    public static final Radix Radix10 = new Radix(10);

    public static final Radix Radix16 = new Radix(16);

    public static final Radix Radix32 = new Radix(32);

    public static final Radix Radix36 = new Radix(36);

    public static final Radix Radix62 = new Radix(62);

    public static final Radix Radix64 = new Radix(64);

    public static final Radix Radix66 = new Radix(66);

    public Radix(int radix){
        if (radix < MIN_RADIX) {
            throw new NumberFormatException("radix " + radix + " less than MIN_RADIX");
        }
        if (radix > MAX_RADIX) {
            throw new NumberFormatException("radix " + radix + " greater than MAX_RADIX");
        }
        this.radix = radix;

        this.blankChar = BLANK_CHAR;

        this.maxChar = digits[radix - 1];
    }


    public String toRadixWithBlank(long value, long length) {
        String dest = toRadix(value);
        if(dest.length() > length){
            return dest;
//            throw new DataException("结果超过最大长度");
        }
        if (dest.length() < length) {
            dest = this.getRepeatStr(blankChar, length - dest.length()) + dest;
        }

        return dest;
    }

    private String getRepeatStr(char value, long length){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < length; i ++){
            builder.append(value);
        }
        return builder.toString();
    }

    public String toRadix(long i) {
        if (radix == 10)
            return Long.toString(i);
        char[] buf = new char[65];
        int charPos = 64;
        boolean negative = (i < 0);

        if (!negative) {
            i = -i;
        }

        while (i <= -radix) {
            buf[charPos--] = digits[(int)(-(i % radix))];
            i = i / radix;
        }
        buf[charPos] = digits[(int)(-i)];

        if (negative) {
            buf[--charPos] = '-';
        }

        return new String(buf, charPos, (65 - charPos));
    }

    private long parseLong(String s, int radix) throws NumberFormatException
    {
        if (s == null) {
            throw new NumberFormatException("null");
        }

        if (radix < MIN_RADIX) {
            throw new NumberFormatException("radix " + radix + " less than MIN_RADIX");
        }
        if (radix > MAX_RADIX) {
            throw new NumberFormatException("radix " + radix + " greater than MAX_RADIX");
        }

        long result = 0;
        boolean negative = false;
        int i = 0, len = s.length();
        long limit = -Long.MAX_VALUE;
        long multmin;
        int digit;

        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') { // Possible leading "+" or "-"
                if (firstChar == '-') {
                    negative = true;
                    limit = Long.MIN_VALUE;
                } else if (firstChar != '+')
                    throw new NumberFormatException("For input string: \"" + s + "\"");

                if (len == 1) // Cannot have lone "+" or "-"
                    throw new NumberFormatException("For input string: \"" + s + "\"");
                i++;
            }
            multmin = limit / radix;
            while (i < len) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                digit = DIGITS_INDEX[s.charAt(i++)];
                if (digit < 0) {
                    throw new NumberFormatException("For input string: \"" + s + "\"");
                }
                if (digit >= radix) {
                    throw new NumberFormatException("For input string: \"" + s + "\"");
                }
                if (result < multmin) {
                    throw new NumberFormatException("For input string: \"" + s + "\"");
                }
                result *= radix;
                if (result < limit + digit) {
                    throw new NumberFormatException("For input string: \"" + s + "\"");
                }
                result -= digit;
            }
        } else {
            throw new NumberFormatException("For input string: \"" + s + "\"");
        }
        return negative ? result : -result;
    }



}
