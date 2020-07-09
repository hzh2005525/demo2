package com.sogal.wx.core.dao.domain.footmark;

/**
 * Created by xiaoxuwang on 2019/3/5.
 */
public enum  UserBehavior {

    ADDONE("点赞"),
    VIEW("查看");

    private final String name;
    UserBehavior(String name){
        this.name = name;
    }

}
