package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.qrcode.QRCodeRealmType;
import lombok.Getter;

@Getter
public enum WechatKind {

    DESIGN("设计方案", QRCodeRealmType.D),
    CASE("客户案例",QRCodeRealmType.C),
    ACTIVITY("营销活动",QRCodeRealmType.A),
    PACKAGE("产品套餐",QRCodeRealmType.P),
    NEWS("新闻资讯",QRCodeRealmType.N),
    RULE("规则制度",QRCodeRealmType.R);

    private final String name;
    private QRCodeRealmType type;

    WechatKind(String name){
        this.name = name;
    }
    WechatKind(String name,QRCodeRealmType type){
        this.name = name;
        this.type = type;
    }

}


