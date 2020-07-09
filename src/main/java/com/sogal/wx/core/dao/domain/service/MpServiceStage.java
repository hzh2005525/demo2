package com.sogal.wx.core.dao.domain.service;

import com.sogal.common.domain.BaseEnum;
import lombok.Getter;

@Getter
public enum MpServiceStage implements BaseEnum {

    NEW("待受理",true),
    WAIT_STAFF("待派工",true),
    WAIT_SERVICE("待上门",true),
    WAIT_EVALUATE("待评价",false),
    EVALUATED("已评价",false),
    CANCELED("已取消",false);


    private final String message;

    /**
     * 是否允许取消
     */
    private boolean cancelAllowed;

    MpServiceStage(String message){
        this.message = message;
    }

    MpServiceStage(String message,boolean cancelAllowed){
        this.message = message;
        this.cancelAllowed = cancelAllowed;
    }
    @Override
    public String getCode() {
        return this.name();
    }

}
