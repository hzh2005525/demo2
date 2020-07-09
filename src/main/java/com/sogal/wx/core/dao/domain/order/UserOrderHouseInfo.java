package com.sogal.wx.core.dao.domain.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserOrderHouseInfo {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("市")
    private String city;

    @ApiModelProperty("区")
    private String area;

    @ApiModelProperty("详细地址")
    private String addr;

    @ApiModelProperty("门牌号")
    private String houseNumber;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("电话")
    private String mobile;

}
