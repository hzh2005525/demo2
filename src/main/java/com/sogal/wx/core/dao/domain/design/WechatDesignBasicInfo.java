package com.sogal.wx.core.dao.domain.design;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WechatDesignBasicInfo {

    @ApiModelProperty("设计编号")
    private String designNo;

    @ApiModelProperty("设计标题")
    private String title;

    @ApiModelProperty("设计显示封面")
    private String coverUrl;

    @ApiModelProperty("设计显示封面")
    private String coverReduceUrl;


    @ApiModelProperty("设计分享配图封面")
    private String posterUrl;

    @ApiModelProperty("设计分享配图封面")
    private String posterReduceUrl;


    @ApiModelProperty("种类")
    private String kind;
}
