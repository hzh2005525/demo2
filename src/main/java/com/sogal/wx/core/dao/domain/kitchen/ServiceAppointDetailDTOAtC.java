package com.sogal.wx.core.dao.domain.kitchen;

import com.sogal.wx.core.dao.domain.image.WechatImage;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ServiceAppointDetailDTOAtC extends MpServiceAppoint{

    private String serviceProviderName;

    private List<WechatImage> finishImages;

    private List<WechatImage> evaluateImages;

    private String realmOfMpServiceFinished;

    private String realmOfMpServiceEvaluated;
}
