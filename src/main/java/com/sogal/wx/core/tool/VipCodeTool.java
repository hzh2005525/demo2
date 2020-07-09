package com.sogal.wx.core.tool;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class VipCodeTool {

    /**
     * 10 进制转换为36进制
     * @param numStr 10 进制字符串
     * @return 36进制结果
     */
    private static String toDuotricenary(String numStr){
        int num  = Integer.valueOf(numStr);
        String str = Integer.toString(num, 36);
        log.info("10 -> 36:" + str);
        return str;
    }

    private static String add_zore(String str, int size){
        if (str.length()<size){
            str= "0"+str;
            str=add_zore(str,size);
            return str;
        }else {
            return str;
        }
    }

    public static String generateVipCode(String userNo){
        String paramUserNo = userNo;
        if(StringUtils.isBlank(userNo)){
            return  null;
        }
        if(paramUserNo.length() == 15){
            String yearDuotricenary = toDuotricenary(paramUserNo.substring(3,5));
            String monthDuotricenary = toDuotricenary(paramUserNo.substring(5,7));
            String dayDuotricenary = toDuotricenary(paramUserNo.substring(7,9));
            String queueNumDuotricenaryResult = Radix.Radix62.toRadixWithBlank(Long.valueOf(paramUserNo.substring(9)),
                    3);
            String vipCode = (yearDuotricenary + monthDuotricenary +dayDuotricenary).toUpperCase()
                    + queueNumDuotricenaryResult;
            log.info("userNo:{} -> vipCode:{}" ,paramUserNo,vipCode);
            return vipCode;
        }else {
            log.info("用户编号长度不是15位,不做统一处理");
            return null;
        }
    }
}
