package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserAuthPromotionInfo extends UserAuthPromotion {

    @ApiModelProperty("用户信息")
    private UserBasicInfo userInfo;

    @ApiModelProperty("获客数")
    private int count;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("推荐者用户id")
    private String recommendId;

    @ApiModelProperty("推荐者用户名称")
    private String recommendName;

    @ApiModelProperty("推荐者用户头像")
    private String recommendAvatarUrl;

    @ApiModelProperty("推荐者用户性别")
    private Byte recommendGender;

    @ApiModelProperty("自动解除剩余天数")
    private Long remainDays;

    @ApiModelProperty("成交额")
    private BigDecimal dealAmount;

    @ApiModelProperty("奖励")
    private BigDecimal rewardAmount;

    @ApiModelProperty("带单数")
    private Integer orderNum;

}
