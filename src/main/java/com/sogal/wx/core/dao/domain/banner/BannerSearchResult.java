package com.sogal.wx.core.dao.domain.banner;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by xiaoxuwang on 2019/3/4.
 */
@Getter
@Setter
public class BannerSearchResult {

    private String id;
    private String onclickUrl;
    private String description;
    private String creator;
    private LocalDateTime timeCreated;
    private String group;
    private String onclickParams;
    private String creatorOrgId;
    private String creatorOrgName;
    private String creatorName;
    private String imageId;

    private String imageUrl;
    private String reduceUrl;
    private String name;
    private String ext;
    private Integer size;

    //admin
    private String imageMd5;
    private Integer sorted;

    /**
     * 行政区域
     */
    private String administrativeRegions;

    /**
     * 目标小程序唯一标识
     */
    private String targetApp;


}
