package com.sogal.wx.core.dao.domain.base;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */
@Getter
public enum  WechatServer {

    APPLET("微信小程序"),
    ADMIN("管理系统");

    private final String name;

    WechatServer(String name){
        this.name = name;
    }


}
