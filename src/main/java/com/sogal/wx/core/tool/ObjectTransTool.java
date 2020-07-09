package com.sogal.wx.core.tool;

import com.sogal.common.util.MBConverter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
public class ObjectTransTool {

    public static <F, T> T beanToBean(F frombean, T toBean){
       return MBConverter.mapToBean(MBConverter.beanToMap(frombean), toBean);
    }

}
