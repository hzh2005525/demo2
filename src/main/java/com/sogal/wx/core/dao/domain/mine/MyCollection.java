package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/7/12
 */
@Getter
@Setter
public class MyCollection extends BaseEntity{

    @ApiModelProperty("用户id")
    private String userId;
    @ApiModelProperty("收藏业务id(如标签id)")
    private String realmId;
    @ApiModelProperty("收藏业务id(如标签id)")
    private String realm;

    public MyCollection(){}

    public MyCollection(String userId, String realmId){
        this.userId = userId;
        this.realmId = realmId;
    }

    public MyCollection(String userId, String realmId, String realm){
        this.userId = userId;
        this.realmId = realmId;
        this.realm = realm;
    }

}
