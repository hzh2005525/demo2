package com.sogal.wx.core.dao.domain.user;

import lombok.Getter;

@Getter
public enum ConvertStatus {
    SENDED("已发送");

    private  final  String name;
    ConvertStatus(String name){
        this.name = name;
    }
}
