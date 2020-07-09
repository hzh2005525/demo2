package com.sogal.wx.core.dao.domain.coupon;

import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserQueryCouponCondition {

    /**
     * 用户unionId
     */
    private String unionId;

    /**
     * 用户手机号
     */
    private String mobile;


    /**
     * 优惠券状态
     */
    private List<String> status;

    @ApiModelProperty(hidden = true)
    private UserLoginToken userLoginToken;

    private Integer pageStart;

    private Integer pageSize;
}


