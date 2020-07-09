package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserBasicInfo {

    @ApiModelProperty("用户id")
    private String id;

    @ApiModelProperty("用户no")
    private String userNo;

    @ApiModelProperty("unionId")
    private String unionId;

    @ApiModelProperty("用户微信昵称")
    private String nickName;

    @ApiModelProperty("用户头像")
    private String avatarUrl;

    @ApiModelProperty("用户性别")
    private Byte gender;

    @ApiModelProperty("小程序类型")
    private WechatCategory category;

}
