package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QueryUserShareRecordCondition extends BaseCondition{

    @ApiModelProperty(value = "访问日期(起)")
    private String queryTimeBegin;

    @ApiModelProperty(value = "访问日期(止)")
    private String queryTimeEnd;

    @ApiModelProperty(value = "用户id")
    private String userId;

    private List<String> methods;

    @ApiModelProperty(value = "专题分类")
    private WechatCategory category;

}
