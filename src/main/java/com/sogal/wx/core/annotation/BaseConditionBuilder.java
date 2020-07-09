package com.sogal.wx.core.annotation;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/3/4.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseConditionBuilder {

    String[] columns() default "*";
    boolean needPage() default true;

}
