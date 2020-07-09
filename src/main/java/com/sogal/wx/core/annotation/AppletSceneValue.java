package com.sogal.wx.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  @Author : zhaojie
 *  @Description : 小程序打开场景值
 *  @Date : 2019/10/10
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface AppletSceneValue {
}
