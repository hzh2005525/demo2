package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserHouse extends BaseEntity{
    private String userId;
    private String unionId;
    private String custId;
    private String houseId;
}
