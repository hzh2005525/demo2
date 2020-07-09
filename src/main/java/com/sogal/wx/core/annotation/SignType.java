package com.sogal.wx.core.annotation;


import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/3/12.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SignType {

    String[] types() default "DESIGN_STYLE";

}
