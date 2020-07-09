package com.sogal.wx.core.dao.domain.enroll;

import com.sogal.common.domain.BaseEnum;
import lombok.Getter;

@Getter
public enum EnrollStage implements BaseEnum {

    CONFIRM("跟进中"),
    MEASURE_STORE("测量且到店"),
    INVALID("无效"),
    TRADED("成交");

    private final String message;

    EnrollStage(String message){
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.name();
    }
}
