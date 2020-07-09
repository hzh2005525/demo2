package com.sogal.wx.core.dao.domain.kitchen;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import com.sogal.wx.core.dao.domain.service.MpServiceType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ServiceAppointPageDTOAtAdmin extends MpServiceAppoint{

    private String serviceProviderName;

    private List<WechatImage> finishImages;

    private List<WechatImage> evaluateImages;

    private String realmOfMpServiceFinished;

    private String realmOfMpServiceEvaluated;

    private String serviceType;


    public void setServiceType(String serviceType) {
        if(MpServiceType.KITCHEN_NURSE.getCode().equals(serviceType)){
            this.serviceType = MpServiceType.KITCHEN_NURSE.getMessage();
        }
    }
}
