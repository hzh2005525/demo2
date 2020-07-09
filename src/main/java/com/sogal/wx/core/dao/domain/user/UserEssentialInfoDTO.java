package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserEssentialInfoDTO extends UserEssentialInfo{
    private String userNo;
    private String userId;
    private WechatCategory category;

    private String registerId;

    private String unionId;

    private List<String> brands;

    private List<UserSignupBrand> userSignupBrands;
}
