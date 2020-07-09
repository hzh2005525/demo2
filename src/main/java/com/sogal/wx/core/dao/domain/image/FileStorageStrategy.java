package com.sogal.wx.core.dao.domain.image;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2018/10/23.
 */
@Getter
public enum FileStorageStrategy {

    PERMANENT("永久"),
    TEMPORARY("临时");

    private final String desc;

    FileStorageStrategy(String desc){
        this.desc = desc;
    }

}
