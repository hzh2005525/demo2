package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.mine.MyVisitorRecord;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserVisitRecordDTO extends MyVisitorRecord {

    @ApiModelProperty(value = "分享人姓名")
    private String sharerName;

    @ApiModelProperty(value = "分享人用户id")
    private String sharerId;

    @ApiModelProperty(value = "分享人昵称")
    private String sharerNickName;

    @ApiModelProperty(value = "设计方案标题")
    private String designTitle;

    @ApiModelProperty(value = "停留时间")
    private long retentionTime;

    @ApiModelProperty(value = "访客认证姓名")
    private String visitorAuthName;

    @ApiModelProperty(value = "访客用户id")
    private String visitorId;

    @ApiModelProperty(value = "访客昵称")
    private String visitorNickName;

    @ApiModelProperty(value = "访客电话")
    private String visitorMobile;

    @ApiModelProperty(value = "访客推广大使认证电话")
    private String visitorAuthMobile;

    @ApiModelProperty(value = "访客推广大使标识")
    private Boolean visitorIsEmissary;

    @ApiModelProperty(value = "访客头像")
    private String visitorAvatarUrl;



}
