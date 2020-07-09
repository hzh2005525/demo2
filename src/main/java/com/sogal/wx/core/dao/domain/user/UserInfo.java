package com.sogal.wx.core.dao.domain.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/19.
 */
@Setter
@Getter
public class UserInfo {

    @ApiModelProperty("用户微信昵称")
    private String nickName;
    @ApiModelProperty("用户性别")
    private Byte gender;
    private String avatarUrl;
    @ApiModelProperty("用户所在国家")
    private String country;
    @ApiModelProperty("用户所在省份")
    private String province;
    @ApiModelProperty("用户所在城市")
    private String city;
    @ApiModelProperty("显示 country，province，city 所用的语言")
    private String language;

}
