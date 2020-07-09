package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.footmark.UserBehavior;
import lombok.Data;

import java.util.Date;

@Data
public class MyVisitorRecord extends BaseEntity {
    private String servant;
    private String visitor;
    private String designId;
    private UserBehavior behavior;
    private WechatCategory category;
    private Date visitDate;
    private String visitBrowseId;
    private String visitMethod;
    private String shareRecordId;
    private String sceneValue;
    private String ip;

    public MyVisitorRecord(){

    }
    private MyVisitorRecord(String servant, String visitor, String designId, UserBehavior behavior,
                            WechatCategory category, String visitBrowseId, String visitMethod, String shareRecordId,
                            String sceneValue,String ip){
        this.servant = servant;
        this.visitor = visitor;
        this.designId = designId;
        this.behavior = behavior;
        this.category = category;
        this.visitBrowseId = visitBrowseId;
        this.visitMethod = visitMethod;
        this.shareRecordId = shareRecordId;
        this.sceneValue = sceneValue;
        this.ip = ip;
    }
    public static MyVisitorRecord buildMyVisitorRecord(String servant, String visitor, String designId,
                                                       UserBehavior behavior, WechatCategory category,
                                                       String visitBrowseId, String visitMethod, String shareRecordId,
                                                       String sceneValue,String ip){
        return new MyVisitorRecord(servant, visitor, designId, behavior, category, visitBrowseId, visitMethod,
                shareRecordId, sceneValue,ip);
    }
}
