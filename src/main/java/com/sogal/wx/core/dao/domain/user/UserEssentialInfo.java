package com.sogal.wx.core.dao.domain.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Getter
@Setter
public class UserEssentialInfo {

    @ApiModelProperty("主键id")
    private String id;
    @ApiModelProperty("手机号")
    private String mobile;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("用户填写省")
    private String userProvince;
    @ApiModelProperty("用户填写市")
    private String userCity;
    @ApiModelProperty("用户填写区")
    private String userArea;
    @ApiModelProperty("用户填写街道、园区、写字楼")
    private String userAddr;

    @ApiModelProperty("用户报名活动文章id或其他关联id")
    private String entityId;

    private String sharerNo;

    @ApiModelProperty(hidden = true)
    private UserLoginToken userLoginToken;
    @ApiModelProperty(hidden = true)
    private String token;

}
