package com.sogal.wx.core.dao.domain.footmark;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatCollection extends BaseEntity{

    @ApiModelProperty("用户id")
    private String userId;
    @ApiModelProperty("设计id")
    private String designId;

    public WechatCollection(){}

    public WechatCollection(String userId, String designId){
        this.userId = userId;
        this.designId = designId;
    }

}
