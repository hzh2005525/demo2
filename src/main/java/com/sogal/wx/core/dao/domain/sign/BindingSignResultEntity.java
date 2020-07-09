package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/7.
 */
@Data
public class BindingSignResultEntity {

    private String bindingId;
    private WechatRealm realm;
    private String realmId;
    private String signId;
    private String signType;
    private String value;
    private String code;
    private String coverUrl;


}
