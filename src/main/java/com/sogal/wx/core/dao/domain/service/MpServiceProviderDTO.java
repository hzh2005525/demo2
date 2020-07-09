package com.sogal.wx.core.dao.domain.service;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpServiceProviderDTO extends MpServiceProvider{

    /**
     * 服务商管理者电话
     */
    private String leaderMobile;

}
