package com.sogal.wx.core.dao.domain.huabao;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.design.DesignShowLevel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CMSHuaBao extends BaseEntity {
    @ApiModelProperty("画报编号")
    private String hbNo;
    @ApiModelProperty("类型")
    private String type;
    /**
     * 内容文案
     */
    @ApiModelProperty("内容文案")
    private String content;
    @ApiModelProperty("背景图")
    private String backgroundImage;

    @ApiModelProperty("背景图宽度")
    private int bgImageWidth;
    @ApiModelProperty("背景图高度")
    private int bgImageHigh;

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

    @ApiModelProperty("分享码类型")
    private String shareCodeType;
    @ApiModelProperty("appId")
    private String appId;

    @ApiModelProperty("小程序码,宽,px")
    private int shareCodeWidth;
    @ApiModelProperty("小程序码坐标,x,px")
    private int shareCodeX;
    @ApiModelProperty("小程序码坐标,y,px")
    private int shareCodeY;


    @ApiModelProperty("画报标题")
    private String title;
    @ApiModelProperty("画报标题字号")
    private  int titleSize;
    @ApiModelProperty("画报标题宽度,px")
    private int titleWidth;
    @ApiModelProperty("画报标题高度,px")
    private int titleHigh;
    @ApiModelProperty("画报标题坐标,x,px")
    private int titleX;
    @ApiModelProperty("画报标题坐标,y,px")
    private int titleY;

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

    private String sharerName;
    @ApiModelProperty("分享人姓名显示字数")
    private int sharerNameLength;
    @ApiModelProperty("分享人姓名字号")
    private int sharerNameSize;
    @ApiModelProperty("分享人姓名宽度,px")
    private int sharerNameWidth;
    @ApiModelProperty("分享人姓名高度,px")
    private int sharerNameHigh;
    @ApiModelProperty("分享人姓名坐标,x,px")
    private int sharerNameX;
    @ApiModelProperty("分享人姓名坐标,y,px")
    private int sharerNameY;
    @ApiModelProperty("分享人姓名是否生效")
    private Boolean sharerNameValid;

    private String sharerMobile;
    @ApiModelProperty("分享人电话显示字数")
    private int sharerMobileLength;
    @ApiModelProperty("分享人电话字号")
    private int sharerMobileSize;
    @ApiModelProperty("分享人电话宽度,px")
    private int sharerMobileWidth;
    @ApiModelProperty("分享人电话高度,px")
    private int sharerMobileHigh;
    @ApiModelProperty("分享人电话坐标,x,px")
    private int sharerMobileX;
    @ApiModelProperty("分享人电话坐标,y,px")
    private int sharerMobileY;
    @ApiModelProperty("分享人电话是否生效")
    private Boolean sharerMobileValid;

    private int sorted;

    @ApiModelProperty("展示等级")
    private DesignShowLevel showLevel;

    private Boolean valid;

    /*
    预览图
     */
    private String previewImageUrl;
    /*
    使用状态
     */
    private String status;
}
