package com.sogal.wx.core.dao.domain.remark;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/4/17.
 */
@Data
public class WechatUserRemark extends BaseEntity{

    private String remark;
    private String userId;

    public WechatUserRemark(){}

    public WechatUserRemark(String remark, String userId, String creator){
        this.remark = remark;
        this.userId = userId;
        super.setCreator(creator);
    }

}
