package com.sogal.wx.core.dao.domain.footmark;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/8.
 */
@Data
public class WechatViewDesignLog extends BaseEntity{

    private String userId;
    private String designId;

    public WechatViewDesignLog(){}

    public WechatViewDesignLog(String userId, String designId){
        this.userId = userId;
        this.designId = designId;
    }
}
