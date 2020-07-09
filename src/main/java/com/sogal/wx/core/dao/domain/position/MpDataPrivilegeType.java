package com.sogal.wx.core.dao.domain.position;

import com.sogal.common.domain.BaseEnum;
import lombok.Getter;


@Getter
public enum MpDataPrivilegeType implements BaseEnum{

    ALL("全部","ASP001","ASR001"),
    DEPARTMENT("本部门","ASP002","ASR002"),
    I("本人","ASP003","ASR003");
    private String message;

    private String positionId;

    private String roleId;

    private MpDataPrivilegeType(String message){ this.message = message;}

    private MpDataPrivilegeType(String message,String positionId){
        this.message = message;
        this.positionId = positionId;
    }
    private MpDataPrivilegeType(String message,String positionId,String roleId){
        this.message = message;
        this.positionId = positionId;
        this.roleId = roleId;
    }


    public String getCode(){return this.name();}
}
