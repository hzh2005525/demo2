package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/4/17.
 */
@Data
public class SignBindingEntity {

    private String bindingId;
    private String coverUrl;
    private String realmId;
    private WechatRealm realm;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;

}
