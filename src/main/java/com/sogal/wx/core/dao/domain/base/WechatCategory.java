package com.sogal.wx.core.dao.domain.base;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/27.
 *
 */
@Getter
public enum WechatCategory {

    REFORM("局部改造"),
    DESIGN("全屋设计"),
    MEIJIA("美家创新"),
    GONGZH("公众号");

    private final String name;

    WechatCategory(String name){
        this.name = name;
    }


}
