package com.sogal.wx.core.dao.domain.share;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShareTemplate extends BaseEntity {
    @ApiModelProperty("模板编号")
    private String templateNo;
    @ApiModelProperty("模板类型")
    private String templateType;
    @ApiModelProperty("背景图")
    private String backgroundImage;
    @ApiModelProperty("海报数量")
    private int posterNum = 1;
    @ApiModelProperty("海报尺寸,高")
    private int posterHigh;
    @ApiModelProperty("海报尺寸，宽")
    private int posterWidth;
    @ApiModelProperty("前景图1")
    private String foreground1;
    @ApiModelProperty("前景图1宽度")
    private int foreground1Width;
    @ApiModelProperty("前景图1高度")
    private int foreground1High;
    @ApiModelProperty("前景图1，x坐标")
    private int foreground1X;
    @ApiModelProperty("前景图1，y坐标")
    private int foreground1Y;
    @ApiModelProperty("前景图1是否有效")
    private Boolean foreground1Valid;
    @ApiModelProperty("前景图2")
    private String foreground2;
    @ApiModelProperty("前景图2宽度")
    private int foreground2Width;
    @ApiModelProperty("前景图2高度")
    private int foreground2High;
    @ApiModelProperty("前景图2，x坐标")
    private int foreground2X;
    @ApiModelProperty("前景图2，y坐标")
    private int foreground2Y;
    @ApiModelProperty("前景图2是否有效")
    private Boolean foreground2Valid;
    @ApiModelProperty("小程序码")
    private String appletCode;
    @ApiModelProperty("码类型(小程序码、二维码)")
    private String appletCodeType;
    @ApiModelProperty("appId")
    private String appId;
    @ApiModelProperty("小程序码,宽,px")
    private int appletCodeWidth;
    @ApiModelProperty("小程序码坐标,x,px")
    private int appletCodeX;
    @ApiModelProperty("小程序码坐标,y,px")
    private int appletCodeY;
    @ApiModelProperty("分享文章配图")
    private String articleImage;
    @ApiModelProperty("分享文章配图宽度,px")
    private int articleImageWidth;
    @ApiModelProperty("分享文章配图高度,px")
    private int articleImageHigh;
    @ApiModelProperty("分享文章配图坐标,x,px")
    private int articleImageX;
    @ApiModelProperty("分享文章配图坐标,y,px")
    private int articleImageY;
    @ApiModelProperty("分享文章配图是否有效")
    private Boolean articleImageValid;
    @ApiModelProperty("分享文章标题")
    private String articleTitle;
    @ApiModelProperty("分享文章标题字号")
    private  int articleTitleSize;
    @ApiModelProperty("分享文章标题宽度,px")
    private int articleTitleWidth;
    @ApiModelProperty("分享文章标题高度,px")
    private int articleTitleHigh;
    @ApiModelProperty("分享文章标题坐标,x,px")
    private int articleTitleX;
    @ApiModelProperty("分享文章标题坐标,y,px")
    private int articleTitleY;
    @ApiModelProperty("分享文章标题是否有效")
    private Boolean articleTitleValid;
    @ApiModelProperty("分享人头像")
    private String avatarUrl;
    @ApiModelProperty("分享人头像宽度,px")
    private int avatarUrlWidth;
    @ApiModelProperty("分享人头像坐标,x,px")
    private int avatarUrlX;
    @ApiModelProperty("分享人头像坐标,y,px")
    private int avatarUrlY;
    @ApiModelProperty("分享人头像是否有效")
    private Boolean avatarUrlValid;
    @ApiModelProperty("分享人昵称")
    private String nickName;
    @ApiModelProperty("分享人昵称显示字数")
    private int nickNameLength;
    @ApiModelProperty("分享人昵称字号")
    private int nickNameSize;
    @ApiModelProperty("分享人昵称宽度,px")
    private int nickNameWidth;
    @ApiModelProperty("分享人昵称高度,px")
    private int nickNameHigh;
    @ApiModelProperty("分享人昵称坐标,x,px")
    private int nickNameX;
    @ApiModelProperty("分享人昵称坐标,y,px")
    private int nickNameY;
    @ApiModelProperty("分享人昵称是否有效")
    private Boolean nickNameValid;
    @ApiModelProperty("专题类别")
    private WechatCategory category;
}
