package com.sogal.wx.core.dao.domain.mp;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MpAccessToken extends BaseEntity {

    @ApiModelProperty("appId")
    private String appId;

    @ApiModelProperty("appSecret")
    private String appSecret;

    @ApiModelProperty("唯一码")
    private String uniqueCode;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("凭据")
    private String accessToken;

    @ApiModelProperty("过期时间")
    private Integer expiresTime;

    @ApiModelProperty("排序")
    private Integer num;

    @ApiModelProperty("图标")
    private String imgUrl;

    @ApiModelProperty("权限")
    private String authority;

    @ApiModelProperty("公众号appid")
    private String gzhAppid;

}
