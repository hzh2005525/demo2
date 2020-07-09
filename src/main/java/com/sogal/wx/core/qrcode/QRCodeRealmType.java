package com.sogal.wx.core.qrcode;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
@Getter
public enum QRCodeRealmType {

    A("活动"),
    B("轮播图"),
    C("案例"),
    D("设计"),
    N("新闻资讯"),
    T("专题表"),
    P("产品套餐"),
    R("规章制度");

    private final String name;

    QRCodeRealmType(String name){
        this.name = name;
    }

}
