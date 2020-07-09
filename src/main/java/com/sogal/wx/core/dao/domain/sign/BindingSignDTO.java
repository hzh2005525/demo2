package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Created by xiaoxuwang on 2019/3/12.
 */
@Data
public class BindingSignDTO {

    @ApiModelProperty(hidden = true)
    private String id;
    @ApiModelProperty("如果是设计就传WECHAT_DESIGN，别的问后端")
    private WechatRealm realm;
    @ApiModelProperty("设计ID，别的问后端")
    private String realmId;
    @ApiModelProperty("标签类别")
//    private SysSignType signType;
    private String signType;
    @ApiModelProperty("标签ID")
    private String signId;

    @ApiModelProperty(hidden = true)
    private String creatorOrgId;
    @ApiModelProperty(hidden = true)
    private String creatorOrgName;
    @ApiModelProperty(hidden = true)
    private String creatorName;
    @ApiModelProperty(hidden = true)
    private String creator;
}
