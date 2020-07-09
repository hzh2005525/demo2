package com.sogal.wx.core.tool;


import org.apache.commons.lang3.StringUtils;

public class AntianaphylaxisTool {

    public static String dataAntianaphylaxis(String data, int beforeLength, int afterLength) {
        if (StringUtils.isBlank(data)) {
            return data;
        }
        int length = data.length();
        String replaceSymbol = "*";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (i < beforeLength || i >= (length - afterLength)) {
                sb.append(data.charAt(i));
            } else {
                sb.append(replaceSymbol);
            }
        }
        return sb.toString();
    }

}
