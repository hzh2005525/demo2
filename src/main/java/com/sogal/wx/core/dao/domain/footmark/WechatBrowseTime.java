package com.sogal.wx.core.dao.domain.footmark;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/18.
 */
@Data
public class WechatBrowseTime extends BaseEntity{

    public WechatBrowseTime(){}

    public WechatBrowseTime(String checkerId, String designId, Long time){
        this.checkerId = checkerId;
        this.designId = designId;
        this.time = time;
    }

    public WechatBrowseTime(String checkerId, String designId, Long time,String visitBrowseId){
        this.checkerId = checkerId;
        this.designId = designId;
        this.time = time;
        this.visitBrowseId = visitBrowseId;
    }

    private String checkerId;
    private String designId;
    private Long time;
    private String visitBrowseId;

}
