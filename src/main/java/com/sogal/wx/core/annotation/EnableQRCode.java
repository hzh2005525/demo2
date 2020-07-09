package com.sogal.wx.core.annotation;

import com.sogal.wx.core.config.QRCodeConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(QRCodeConfig.class)
public @interface EnableQRCode {
}
