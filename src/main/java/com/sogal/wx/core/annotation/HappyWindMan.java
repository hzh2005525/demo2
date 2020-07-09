package com.sogal.wx.core.annotation;

import com.sogal.wx.core.dao.domain.footmark.UserBehavior;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/3/6.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HappyWindMan {

    UserBehavior type();

}
