package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Data;

@Data
public class MySharer extends BaseEntity {
    private String userId;
    //首次分享人ID
    private String firstSharerId;
    //最近分享人ID
    private String latestSharerId;
    private WechatCategory category;

    public MySharer(){

    }
    public MySharer(String userId, String firstSharerId, String latestSharerId, WechatCategory category) {
        this.userId = userId;
        this.firstSharerId = firstSharerId;
        this.latestSharerId = latestSharerId;
        this.category = category;
    }
}
