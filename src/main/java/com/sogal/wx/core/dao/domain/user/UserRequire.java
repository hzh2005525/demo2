package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequire extends BaseEntity {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户报名id
     */
    private String registerId;

    /**
     * 用户unionId
     */
    private String unionId;

    /**
     * 装修类型:新房装修;老房装修
     */
    private String decorationType;

    /**
     * 装修风格
     */
    private String decorationStyles;

    /**
     * 品类
     */
    private String productCategories;

    /**
     * (最少)装修预算
     */
    private Double minBudget;

    /**
     * (最多)装修预算
     */
    private Double maxBudget;

    /**
     * 户型
     */
    private String houseType;

    /**
     * 户型图url
     */
    private String houseTypeUrl;

    /**
     * 老人数量
     */
    private int oldPeople;

    /**
     * 小孩数量
     */
    private int child;

    /**
     * 装修范围
     */
    private String budgetRange;

}
