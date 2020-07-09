package com.sogal.wx.core.dao.domain.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WechatUserRegisterDTO extends WechatUserRegister {

    @ApiModelProperty(value = "分享人Id")
    private String sharerId;

    @ApiModelProperty(value = "分享人编号")
    private String sharerNo;

    @ApiModelProperty(value = "分享人姓名")
    private String sharerName;

    @ApiModelProperty(value = "分享人电话")
    private String sharerMobile;

    @ApiModelProperty("用户微信昵称")
    private String sharerNickName;

    @ApiModelProperty("参加活动对应文章名称")
    private String activityName;

    /**
     * 用户报名时所选的品类
     */
    private String brands;
}
