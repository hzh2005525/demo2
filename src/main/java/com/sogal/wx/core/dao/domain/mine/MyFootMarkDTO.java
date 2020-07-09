package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyFootMarkDTO extends BaseCondition {

    private String startTime;
    private String endTime;
    private String userId;
    private WechatCategory category;

}
