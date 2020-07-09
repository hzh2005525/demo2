package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public final class UserLoginToken extends UserInfo {

    @ApiModelProperty(hidden = true)
    private String ip;
    @ApiModelProperty(hidden = true)
    private UserInfoExtendDTO wechatUser;

    private WechatCategory category;

}
