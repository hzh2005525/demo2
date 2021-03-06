package com.sogal.wx.core.annotation;

import com.sogal.wx.core.config.WechatConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by xiaoxuwang on 2019/2/19.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WechatConfig.class)
public @interface EnableWechatConfig {
}
