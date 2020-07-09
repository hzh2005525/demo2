package com.sogal.wx.core.dao.domain.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WechatSharerBasicInfo {

    @ApiModelProperty("用户编号")
    private String userNo;

    @ApiModelProperty("用户微信头像")
    private String avatarUrl;

    @ApiModelProperty("用户微信昵称")
    private String nickName;

    private Boolean isEmissary;

    private String emissaryType;
}
