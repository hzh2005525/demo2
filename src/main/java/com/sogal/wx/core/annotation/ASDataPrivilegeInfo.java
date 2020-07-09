package com.sogal.wx.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2020/1/13
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ASDataPrivilegeInfo {
}
