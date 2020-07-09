package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.enroll.EnrollStage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class QueryUserCondition {

    @ApiModelProperty(value = "注册时间(起)")
    private Date timeCreatedBegin;

    @ApiModelProperty(value = "注册时间(止)")
    private Date timeCreatedEnd;
    @ApiModelProperty(value = "等级:VISITOR,USER")
    private List<String> levels;

    @ApiModelProperty(value = "等级:REFORM或DESIGN")
    private WechatCategory category;

    @ApiModelProperty("专题类别:多个:REFORM，DESIGN")
    private List<String> categories;

    @ApiModelProperty(value = "用户或访客手机号")
    private String mobile;

    @ApiModelProperty(value = "用户或访客姓名")
    private String name;

    @ApiModelProperty(value = "用户或访客编号")
    private String userNo;

    @ApiModelProperty(value = "用户或访客所在城市")
    private String userCity;

    @ApiModelProperty("用户微信昵称")
    private String nickName;

    @ApiModelProperty(value = "分享人编号")
    private String sharerNo;

    @ApiModelProperty(value = "分享人姓名")
    private String sharerName;

    @ApiModelProperty(value = "分享人电话")
    private String sharerMobile;

    @ApiModelProperty("用户微信昵称")
    private String sharerNickName;

    @ApiModelProperty("认证类型")
    private String emissaryType;

    @ApiModelProperty("活动名称")
    private String activityName;

    @ApiModelProperty("报名数据阶段")
    private EnrollStage stage;

}
