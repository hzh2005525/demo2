package com.sogal.wx.core.dao.domain.article;

import lombok.Getter;

@Getter
public enum ArticleElementType {
    HEAD("大标题"),
    SUB_HEAD("小标题"),
    GENERAL_PIC("普通图片"),
    NET_PIC("网络图片"),
    DDD_PIC ("3D图片"),
    TEXT("正文"),
    VIDEO("视频"),
    NET_VIDEO_LINK("网络视频链接"),
    COMPONENT("组件");

    private final String name;

    ArticleElementType(String name){
        this.name = name;
    }



}
