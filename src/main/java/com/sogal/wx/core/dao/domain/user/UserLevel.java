package com.sogal.wx.core.dao.domain.user;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
public enum UserLevel {

    VISITOR("访客"),
    USER("普通用户"),
    CUSTOMER("客户");

    private final String name;

    UserLevel(String name){
        this.name = name;
    }

}
