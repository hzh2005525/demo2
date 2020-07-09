package com.sogal.wx.core.dao.domain.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WechatUserFillBasicInfo {
    /**
     * 用户报名id
     */
    private String id;
    @ApiModelProperty("报名填写手机号")
    private String mobile;
    @ApiModelProperty("报名填写名字")
    private String name;
    @ApiModelProperty("用户填写省")
    private String userProvince;
    @ApiModelProperty("用户填写市")
    private String userCity;
    @ApiModelProperty("用户填写区")
    private String userArea;
    @ApiModelProperty("用户填写街道、园区、写字楼")
    private String userAddr;
    private Boolean first;
}
