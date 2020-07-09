package com.sogal.wx.core.dao.domain.charts;

import com.sogal.wx.core.dao.domain.user.WechatUser;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserChartsDTO extends WechatUser{

    private String userId;
    private int visitTotalOfVisitor;
    private int visitorTotal;
    private int signUpTotal;

}
