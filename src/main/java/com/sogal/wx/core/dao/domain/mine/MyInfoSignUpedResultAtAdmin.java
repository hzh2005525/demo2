package com.sogal.wx.core.dao.domain.mine;

import lombok.Data;

import java.util.Date;

@Data
public class MyInfoSignUpedResultAtAdmin {


    /**
     * 用户报名时间
     */
    private Date timeCreated;

    /**
     * 推荐人用户微信头像
     */
    private String avatarUrl;

    /**
     * 用户报名电话
     */
    private String mobile;

    /**
     * 用户(报名)填写省
     */
    private String userProvince;

    /**
     * 用户(报名)填写市
     */
    private String userCity;

    /**
     * 用户(报名)填写区
     */
    private String userArea;

    /**
     * 用户(报名)填写街道、园区、写字楼
     */
    private String userAddr;

    /**
     * 报名来源页面
     */
    private String sourcePage;

    /**
     * 页面(文章)id
     */
    private String entityId;

    /**
     * 推荐人id
     */
    private String referrerId;

    /**
     * 推荐人用户昵称
     */
    private String referrerNickName;

    /**
     * 推荐人姓名
     */
    private String referrerName;

}

