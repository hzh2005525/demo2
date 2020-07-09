package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Data;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/4/25.
 */
@Data
public class MyRecordDTO extends BaseCondition{

    private String startTime;
    private String endTime;
    private String servent;
    private String serventId;
    private String visitorId;
    private WechatCategory category;
    private List<String> customer;
}
