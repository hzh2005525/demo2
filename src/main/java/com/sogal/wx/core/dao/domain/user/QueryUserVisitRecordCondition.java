package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class QueryUserVisitRecordCondition {

    @ApiModelProperty(value = "访问日期(起)")
    private String visitDateBegin;

    @ApiModelProperty(value = "访问日期(止)")
    private String visitDateEnd;

    @ApiModelProperty(value = "专题分类")
    private WechatCategory category;

    private String shareRecordId;

    private List<String> visitMethods;

    private Integer pageStart;
    private Integer pageSize;

}
