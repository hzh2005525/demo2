package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/11/4
 */
@Data
public class TagBindingsDTO {

    @ApiModelProperty("待绑定实体类型")
    private WechatRealm realm;
    @ApiModelProperty("待绑定实体id")
    private String realmId;
    @ApiModelProperty("标签绑定关系数据")
    private List<WechatSysSignBinding> wechatSysSignBindings;
}
