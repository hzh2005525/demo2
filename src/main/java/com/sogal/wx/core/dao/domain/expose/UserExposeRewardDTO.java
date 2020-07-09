package com.sogal.wx.core.dao.domain.expose;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserExposeRewardDTO extends UserExposeReward {

    @ApiModelProperty("文章标题")
    private String designTitle;

    @ApiModelProperty("浏览人昵称")
    private String visitorNickName;

    @ApiModelProperty("浏览人头像")
    private String visitorAvatarUrl;

    @ApiModelProperty("推荐人昵称")
    private String referNickName;

    @ApiModelProperty("推荐人头像")
    private String referAvatarUrl;

    @ApiModelProperty("状态,1:发放中;2:发放失败;3:发放成功")
    private Integer status;

    @ApiModelProperty("商户订单号")
    private String partnerTradeNo;

}
