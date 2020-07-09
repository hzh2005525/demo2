package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MyUserInfoSignUped extends BaseCondition{

    @ApiModelProperty(value = "报名时间(起)")
    private String dateCreatedBegin;

    @ApiModelProperty(value = "报名时间(止)")
    private String dateCreatedEnd;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "专题分类")
    private WechatCategory category;

}
