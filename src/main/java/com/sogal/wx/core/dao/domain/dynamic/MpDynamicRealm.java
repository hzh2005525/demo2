package com.sogal.wx.core.dao.domain.dynamic;


import com.sogal.common.domain.BaseEnum;
import lombok.Getter;

@Getter
public enum MpDynamicRealm implements BaseEnum {

    KITCHEN_NURSE("厨房护理");


    private String message;


    MpDynamicRealm(String message) {
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.name();
    }


}
