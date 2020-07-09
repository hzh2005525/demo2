package com.sogal.wx.core.annotation;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/2/22.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AppletLoginRequired {
}
