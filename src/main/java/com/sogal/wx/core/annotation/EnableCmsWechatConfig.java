package com.sogal.wx.core.annotation;

import com.sogal.wx.core.config.CmsWechatConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(CmsWechatConfig.class)
public @interface EnableCmsWechatConfig {
}
