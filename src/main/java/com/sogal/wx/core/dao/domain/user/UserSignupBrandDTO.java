package com.sogal.wx.core.dao.domain.user;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserSignupBrandDTO {
    /**
     * 主键id
     */
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户报名id
     */
    private String registerId;
    /**
     * 报名时所选品牌
     */
    private String brand;

}
