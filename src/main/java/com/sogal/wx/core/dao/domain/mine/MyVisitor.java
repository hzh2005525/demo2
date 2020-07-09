package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Data;

import java.util.Date;

@Data
public class MyVisitor extends BaseEntity {
    private String servant;
    private String visitor;
    private WechatCategory category;
    private Date visitDate;

    public MyVisitor(){

    }
    private MyVisitor(String servant,String visitor,WechatCategory category){
        this.servant = servant;
        this.visitor = visitor;
        this.category = category;

    }

    public static MyVisitor buildMyVisitor(String servant,String visitor,WechatCategory category){
        return new MyVisitor(servant,visitor,category);
    }
}
