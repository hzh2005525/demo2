package com.sogal.wx.core.dao.domain.service;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpServiceProvider extends BaseEntity{

    /**
     * 服务商名称
     */
    private String name;
    /**
     * 是否可用
     */
    private Boolean valid;
    /**
     * 无效时间
     */
    private Date invalidTime;

    /**
     * 服务商管理者id
     */
    private String leaderId;
}
