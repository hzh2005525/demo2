package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.user.UserLevel;
import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/4/24.
 */
@Getter
public enum CustomerStatus {

    VISITOR("访客", UserLevel.VISITOR),
    SIGN_UP("报名"),
    HANDSEL("定金"),
    PLACE_ORDER("签单");

    private String desc;
    private UserLevel level;


    CustomerStatus(String desc){
        this.desc = desc;
    }

    CustomerStatus(String desc, UserLevel level){
        this.desc = desc;
        this.level = level;
    }

}
