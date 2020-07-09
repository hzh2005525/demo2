package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Setter
@Getter
public class WechatSysSignBinding extends BaseEntity{

    @ApiModelProperty("绑定实体")
    private WechatRealm realm;
    @ApiModelProperty("绑定实体id")
    private String realmId;
    @ApiModelProperty("标签id")
    private String signId;

    @ApiModelProperty("标签类别")
//    private SysSignType signType;
    private String signType;

    @ApiModelProperty(hidden = true)
    private String creatorOrgId;
    @ApiModelProperty(hidden = true)
    private String creatorOrgName;
    @ApiModelProperty(hidden = true)
    private String creatorName;

}
