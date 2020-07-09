package com.sogal.wx.core.dao.domain.design;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KJLDesignBasicInfo {
    private String name;
    private String designId;
    private String qwPicUrl;
    private String panoLink;

    public KJLDesignBasicInfo(String name, String designId, String qwPicUrl) {
        this.name = name;
        this.designId = designId;
        this.qwPicUrl = qwPicUrl;

    }
    public KJLDesignBasicInfo() {

    }
}
