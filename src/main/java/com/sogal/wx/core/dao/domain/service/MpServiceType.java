package com.sogal.wx.core.dao.domain.service;

import com.sogal.common.domain.BaseEnum;
import lombok.Getter;

@Getter
public enum MpServiceType implements BaseEnum {

    KITCHEN_NURSE("厨房护理");


    private final String message;

    MpServiceType(String message){
        this.message = message;
    }
    @Override
    public String getCode() {
        return this.name();
    }

}
