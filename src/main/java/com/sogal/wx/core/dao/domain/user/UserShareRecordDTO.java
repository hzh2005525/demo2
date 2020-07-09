package com.sogal.wx.core.dao.domain.user;

import lombok.Data;

import java.util.Date;

@Data
public class UserShareRecordDTO {

    /**
     * 用户分享时间
     */
    private Date timeCreated;
    /**
     * 方式
     */
    private String method;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章id
     */
    private String articleId;

    /**
     * 分享记录id
     */
    private String shareRecordId;

    /**
     * 访问次数
     */
    private int visitNum;

    /**
     * 分享编号
     */
    private String realmShareNo;

    /**
     * 画报标题
     */
    private String hbTitle;
    /**
     * 画报预览图
     */
    private String hbPreviewImageUrl;



}
