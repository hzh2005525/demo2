package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.enroll.EnrollStage;
import com.sogal.wx.core.dao.domain.user.UserRequire;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MyUserInfoSignUpedResult {

    private String id;

    @ApiModelProperty(value = "用户报名时间")
    private Date timeCreated;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty("用户微信头像")
    private String avatarUrl;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "用户电话")
    private String mobile;

    @ApiModelProperty(value = "用户认证标识(推广大使)")
    private Boolean isEmissary;

    @ApiModelProperty("用户(报名)填写省")
    private String userProvince;
    @ApiModelProperty("用户(报名)填写市")
    private String userCity;
    @ApiModelProperty("用户(报名)填写区")
    private String userArea;
    @ApiModelProperty("用户(报名)填写街道、园区、写字楼")
    private String userAddr;

    @ApiModelProperty(value = "来源页面")
    private String sourcePage;

    @ApiModelProperty(value = "页面(文章)id")
    private String entityId;

    @ApiModelProperty(value = "报名用户id")
    private String userId;

    @ApiModelProperty(value = "报名用户所处阶段")
    private EnrollStage stage;

    private UserRequire userRequire;

}

