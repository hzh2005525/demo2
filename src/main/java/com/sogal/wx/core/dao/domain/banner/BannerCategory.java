package com.sogal.wx.core.dao.domain.banner;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by xiaoxuwang on 2019/4/8.
 */
@Getter
public enum BannerCategory {

    REFORM(WechatCategory.REFORM, new HashSet<>(Arrays.asList(BannerGroup1.DESIGN_HEAD, BannerGroup1.INDEX_1,
            BannerGroup1.INDEX_2, BannerGroup1.HOT_HEAD, BannerGroup1.DESIGN_HEAD, BannerGroup1.DETAIL_1,
            BannerGroup1.DETAIL_2, BannerGroup1.USER_INFO_U, BannerGroup1.USER_INFO_U_1))),
    DESIGN(WechatCategory.DESIGN, new HashSet<>(Arrays.asList(BannerGroup1.WUKONG_HEAD, BannerGroup1.WUKONG_1,
            BannerGroup1.WUKONG_LIST, BannerGroup1.WUKONG_LIST_TAIL, BannerGroup1.WK_DETAIL_1, BannerGroup1.WK_DETAIL_2,
            BannerGroup1.USER_INFO_JU, BannerGroup1.USER_INFO_JU_1)));

    private HashSet<BannerGroup1> groups;
    private WechatCategory category;
    private String name;

    BannerCategory(WechatCategory category, HashSet<BannerGroup1> groups){
        this.groups = groups;
        this.category = category;
        this.name = category.getName();
    }

}
