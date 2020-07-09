package com.sogal.wx.core.annotation;

import com.sogal.wx.core.config.MpQRCodeConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MpQRCodeConfig.class)
public @interface EnableMpQRCode {
}
