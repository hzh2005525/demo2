package com.sogal.wx.core.dao.domain.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class UserExtendRecordDTO {
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty("用户微信头像")
    private String avatarUrl;

    @ApiModelProperty(value = "设计方案标题")
    private String title;

    @ApiModelProperty(value = "停留时间")
    private long retentionTime;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty("推广大使手机号")
    private String authMobile;

    @ApiModelProperty(value = "用户电话")
    private String mobile;

    @ApiModelProperty(value = "用户认证标识(推广大使)")
    private Boolean isEmissary;

    @ApiModelProperty(value = "用户访问时间")
    private Date visitTime;

    @ApiModelProperty(value = "用户访问方式")
    private String visitMethod;
    @ApiModelProperty(value = "访客id")
    private String visitor;
    @ApiModelProperty(value = "设计(文章)id")
    private String designId;

}
