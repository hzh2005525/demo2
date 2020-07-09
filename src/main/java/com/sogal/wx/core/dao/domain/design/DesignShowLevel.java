package com.sogal.wx.core.dao.domain.design;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
public enum DesignShowLevel {

    PUBLIC("公开"),
    PRIVATE("私有");

    private final String name;

    DesignShowLevel(String name){
        this.name = name;
    }

}
