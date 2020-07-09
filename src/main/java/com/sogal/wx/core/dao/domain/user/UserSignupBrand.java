package com.sogal.wx.core.dao.domain.user;

import com.sogal.common.util.StringUtil;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserSignupBrand {
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
    /**
     * 报名时间
     */
    private Date timeCreated;

    public UserSignupBrand(String userId, String registerId, String brand) {
        this.id = StringUtil.uuid();;
        this.userId = userId;
        this.registerId = registerId;
        this.brand = brand;
    }
}
