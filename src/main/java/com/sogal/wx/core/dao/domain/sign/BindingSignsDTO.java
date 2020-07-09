package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import lombok.Data;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/7.
 */
@Data
public class BindingSignsDTO {

    private WechatRealm realm;
    private String realmId;
    private List<SignDTO> signs;

    private List<WechatSysSignBinding> wechatSysSignBindings;
}
