package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAuthPromotionRemark extends BaseEntity {

    @ApiModelProperty("推广注册id")
    private String promotionId;

    @ApiModelProperty("备注")
    private String remark;

}
