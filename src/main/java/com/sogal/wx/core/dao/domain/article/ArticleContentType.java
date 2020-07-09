package com.sogal.wx.core.dao.domain.article;

import lombok.Getter;

@Getter
public enum  ArticleContentType {
    DOM("DOM模式","dom"),
    RTF("富文本模式","rtf");

    private final String name;

    private  String code;

    ArticleContentType(String name, String code){
        this.name = name;
        this.code = code;
    }
}
