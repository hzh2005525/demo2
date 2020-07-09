package com.sogal.wx.core.annotation;

import com.sogal.wx.core.dao.domain.share.ShareMethod;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/3/8.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ShareDesign {

    ShareMethod method() default ShareMethod.QRCODE;

}
