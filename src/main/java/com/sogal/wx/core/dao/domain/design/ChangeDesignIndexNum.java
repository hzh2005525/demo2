package com.sogal.wx.core.dao.domain.design;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeDesignIndexNum {

    @ApiModelProperty("设计方案id")
    private String id;
    @ApiModelProperty("查看数")
    private Integer viewNum;
    @ApiModelProperty("收藏数")
    private Integer collectNum;
    @ApiModelProperty("分享数")
    private Integer shareNum;
    @ApiModelProperty("点赞数")
    private Integer praiseNum;
    @ApiModelProperty("排序字段")
    private Integer sorted;
    @ApiModelProperty("报名人数")
    private Integer signupNum;

    private String updator;

}
