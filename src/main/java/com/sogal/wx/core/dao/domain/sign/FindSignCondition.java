package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/7.
 */
@Data
public class FindSignCondition extends BaseCondition{

    @ApiModelProperty("标签绑定实体ID")
    private String realmId;
    @ApiModelProperty("标签绑定实体")
    private WechatRealm realm;
    @ApiModelProperty("标签ID")
    private String signId;
    @ApiModelProperty("标签类型")
    private String signType;
    @ApiModelProperty("标签中文值（支持模糊查询）")
    private String value;
    @ApiModelProperty("标签编码")
    private String code;

    public FindSignCondition(){}
    public FindSignCondition(WechatRealm realm, String realmId){
        this.realm = realm;
        this.realmId = realmId;
    }
}
