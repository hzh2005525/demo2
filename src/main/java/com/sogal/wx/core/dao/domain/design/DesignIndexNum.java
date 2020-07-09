package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DesignIndexNum extends BaseEntity {

    @ApiModelProperty("uuid")
    private String id;
    @ApiModelProperty("设计方案id")
    private String designId;
    @ApiModelProperty("查看数")
    private int viewNum;
    @ApiModelProperty("收藏数")
    private int collectNum;
    @ApiModelProperty("分享数")
    private int shareNum;
    @ApiModelProperty("点赞数")
    private int praiseNum;
    @ApiModelProperty("同步日期")
    private Date syncDate;

    public DesignIndexNum() {

    }


    public DesignIndexNum(String designId, int viewNum, int collectNum, int shareNum, int praiseNum) {
        this.id = super.getId();
        this.designId = designId;
        this.viewNum = viewNum;
        this.collectNum = collectNum;
        this.shareNum = shareNum;
        this.praiseNum = praiseNum;
    }
}
