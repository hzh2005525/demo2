package com.sogal.wx.core.annotation;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/4/22.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CollectFormId {
}
