package com.sogal.wx.core.dao.domain.banner;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/3/2.
 */
@Getter
public enum BannerGroup1 {

    INDEX_HEAD("【全屋定制】主页顶部轮播图"),
    INDEX_1("【全屋定制】主页广告1"),
    INDEX_2("【全屋定制】主页广告2"),
    HOT_HEAD("【全屋定制】热门设计主页顶部图"),
    DESIGN_HEAD("【全屋定制】主页顶部图"),
    DETAIL_1("【全屋定制】详情页广告1"),
    DETAIL_2("【全屋定制】详情页广告2"),
    WUKONG_HEAD("【悟空快装】主页顶部"),
    WUKONG_1("【悟空快装】主页广告1"),
    WUKONG_LIST("【悟空快装】列表页顶部"),
    WUKONG_LIST_TAIL("【悟空快装】列表页底部"),
    WK_DETAIL_1("【悟空快装】详情页广告1"),
    WK_DETAIL_2("【悟空快装】详情页广告2"),
    USER_INFO_U("【全屋设计】用户信息补充页面优惠券"),//预约测量
    USER_INFO_JU("【悟空快装】用户信息补充页面优惠券"),//预约测量
    USER_INFO_U_1("【全屋设计】用户信息补充页面广告"),//预约测量
    USER_INFO_JU_1("【悟空快装】用户信息补充页面广告"),//预约测量
    APPOINT_MEASURE_1("【全屋设计】预约测量页广告1"),//活动报名
    APPOINT_MEASURE_2("【全屋设计】预约测量页广告2"),//活动报名
    APPOINT_MEASURE_JU_1("【悟空快装】预约测量页广告1"),//活动报名
    APPOINT_MEASURE_JU_2("【悟空快装】预约测量页广告2");//活动报名
    private final String name;

    BannerGroup1(String name){
        this.name = name;
    }

}
