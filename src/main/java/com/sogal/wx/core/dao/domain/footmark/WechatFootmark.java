package com.sogal.wx.core.dao.domain.footmark;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/3/5.
 */
@Getter
@Setter
public class WechatFootmark extends BaseEntity{

    private String userId;
    private String designId;
    private UserBehavior behavior;

    public WechatFootmark(){}

    public WechatFootmark(UserBehavior behavior){
        this.behavior = behavior;
    }

}
