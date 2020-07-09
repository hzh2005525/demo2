package com.sogal.wx.core.dao.domain.share;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/3/1.
 */
@Getter
@Setter
public class WechatShare extends BaseEntity{

    private ShareMethod method;
//    private WechatRealm realmType;
    private String realmType;
    private String realmShareNo;
    private String realmSharerNo;
    /**
     * 与查看分享、扫码分享关联id
     */
    private String shareRecordId;
    /**
     * 与查看分享、扫码分享关联id
     */
    private String sceneParamContent;

    private WechatCategory category;


    public WechatShare(){

    }
    public WechatShare(ShareMethod method, String realmType, String realmShareNo, String realmSharerNo,
                       WechatCategory category){
        this.method = method;
        this.realmType = realmType;
        this.realmShareNo = realmShareNo;
        this.realmSharerNo = realmSharerNo;
        this.category = category;
    }

    public WechatShare(String shareRecordId,String sceneParamContent,ShareMethod method, String realmType, String realmShareNo,
                       String realmSharerNo, WechatCategory category){
        this.shareRecordId = shareRecordId;
        this.sceneParamContent = sceneParamContent;
        this.method = method;
        this.realmType = realmType;
        this.realmShareNo = realmShareNo;
        this.realmSharerNo = realmSharerNo;
        this.category = category;
    }

    public WechatShare(String shareRecordId,ShareMethod method, String realmType, String realmShareNo,
                       String realmSharerNo, WechatCategory category){
        this.shareRecordId = shareRecordId;
        this.method = method;
        this.realmType = realmType;
        this.realmShareNo = realmShareNo;
        this.realmSharerNo = realmSharerNo;
        this.category = category;
    }
}
