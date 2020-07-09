package com.sogal.wx.core.dao.domain.service;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Setter
@Getter
public class MpServiceStaffDTO extends MpServiceStaff{

    private Boolean isleader = false;

    private String leaderId;

    private String providerId;


    public MpServiceStaffDTO setLeaderId(String leaderId) {
            this.leaderId = leaderId;
        if(StringUtils.isBlank(leaderId)){
            this.isleader = false;
        }else {
            this.isleader = true;
        }
        return this;
    }
}
