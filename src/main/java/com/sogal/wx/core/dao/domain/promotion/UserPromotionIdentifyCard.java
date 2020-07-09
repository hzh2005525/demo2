package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionIdentifyCard extends BaseEntity {

    @ApiModelProperty("unionId")
    private String unionId;

    @ApiModelProperty("实名认证状态,0:认证中;1:认证失败;2:认证成功;3:已到期")
    private Integer status;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("身份证")
    private String identityCode;

    @ApiModelProperty("身份证正面URL")
    private String frontUrl;

    @ApiModelProperty("身份证反面URL")
    private String backUrl;

    @ApiModelProperty("身份证签发日期")
    private String signDt;

    @ApiModelProperty("身份证失效日期")
    private String invalidDt;

    @ApiModelProperty("是否绑定银行卡,0:未绑卡;1:已绑卡")
    private Integer bankStatus;

    @ApiModelProperty("银行卡")
    private String accountNo;

    @ApiModelProperty("银行名称")
    private String accountBank;

    @ApiModelProperty("电子合同ID")
    private String aesId;

}
