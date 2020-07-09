package com.sogal.wx.core.dao.domain.kitchen;

import lombok.Getter;

@Getter
public enum ServiceAppointStage {

    NEW("待受理"),
    WAIT_STAFF("待派工"),
    WAIT_SERVICE("待上门"),
    WAIT_EVALUATE("待评价"),
    EVALUATED("已评价"),
    CANCELED("已取消");

    private final String desc;

    ServiceAppointStage(String desc){
        this.desc = desc;
    }
}
