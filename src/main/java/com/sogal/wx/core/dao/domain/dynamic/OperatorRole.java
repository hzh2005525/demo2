package com.sogal.wx.core.dao.domain.dynamic;


import com.sogal.common.domain.BaseEnum;
import lombok.Getter;

/**
 *  @Author : zhaojie
 *  @Description : 操作者角色
 *  @Date : 2020/1/1
 */
@Getter
public enum OperatorRole implements BaseEnum {

    CS("客服"),
    USER("用户");


    private String message;


    OperatorRole(String message) {
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.name();
    }


}
