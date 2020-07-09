package com.sogal.wx.core.dao.domain.designer;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/7/17
 */
@Getter
@Setter
public class WechatDesigner extends BaseEntity{

    public WechatDesigner(){}
    @ApiModelProperty("用户")
    private String userId;
    @ApiModelProperty("用户unionId")
    private String unionId;
    @ApiModelProperty("设计师名字")
    private String name;
    @ApiModelProperty("级别")
    private String level;
    @ApiModelProperty("所属公司或门店")
    private String company;

    @ApiModelProperty("设计师身份类别,主案:mc;助理:ac")
    private String identity;

    @ApiModelProperty("设计师头像")
    private String avatarUrl;

    @ApiModelProperty("设计师填写地址信息")
    private String addr;

    @ApiModelProperty("简介")
    private String briefIntroduction;
    @ApiModelProperty("风格")
    private String myStyle;

    private WechatCategory category;

    private String status ;


    @ApiModelProperty("推荐状态,0:未推荐；1:已推荐")
    private Integer shift;

    @ApiModelProperty("推荐排序编号,从1开始,默认0")
    private Integer orderNum;

    @ApiModelProperty("设计师微信二维码url")
    private String wxQrcodeUrl;

    @ApiModelProperty("设计师封面url")
    private String designerCoverUrl;


    @ApiModelProperty(hidden = true)
    private String createTime;

    public void setTimeCreated(LocalDateTime timeCreated){
        super.setTimeCreated(timeCreated);
        if(timeCreated!=null) {
            createTime = timeCreated.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }



}
