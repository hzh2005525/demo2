package com.sogal.wx.core.dao.domain.user;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Getter
public enum  UserLanguage {

    en("英文"),
    zh_CN("简体中文"),
    zh_TW("繁体中文");

    private final String name;

    UserLanguage(String name){
        this.name = name;
    }

}
