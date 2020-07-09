package com.sogal.wx.core.dao.domain.service;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MpServiceProviderStaff extends BaseEntity{

    /**
     * 服务商ID
     */
    private String serviceProviderId;

    /**
     * 服务商工人id
     */
    private String serviceStaffId;

    public MpServiceProviderStaff(){

    }
    public MpServiceProviderStaff(String serviceProviderId, String serviceStaffId) {
        this.serviceProviderId = serviceProviderId;
        this.serviceStaffId = serviceStaffId;
    }
}
