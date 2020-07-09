package com.sogal.wx.core.tool;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.error.WechatCoreError;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Tool {

    /**
     * MD5加密
     * @param input 加密字符串
     * @return MD5字符串
     */
    public static String MD5( String input) throws BizException{
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        }catch (NoSuchAlgorithmException e){
            throw new BizException(WechatCoreError.CREATE_MD5_FAIL);
        }
        byte[] digest = md.digest(input.getBytes());
        return byte2hex(digest);
    }

    private static String byte2hex(final byte[] digest) {
        String des = "";
        String tmp = null;
        for ( byte element : digest) {
            tmp = (Integer.toHexString(element & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

}
