package com.sogal.wx.core.dao.domain.design;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sogal.common.util.DecimalSerializer;
import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatDesign extends BaseEntity {

    public WechatDesign(){

    }
    public WechatDesign(Integer hotLevel, String title, String panorama, DesignShowLevel showLevel,
                        DesignCreatorIdentity creatorIdentity, BigDecimal hprice, BigDecimal lprice, String cover,
                        String describeArticle, WechatCategory category, LocalDateTime publishTime, String kind,
                        Integer area, Boolean formaled) {
        this.hotLevel = hotLevel;
        this.title = title;
        this.panorama = panorama;
        this.showLevel = showLevel;
        this.creatorIdentity = creatorIdentity;
        this.hprice = hprice;
        this.lprice = lprice;
        this.cover = cover;
        this.describeArticle = describeArticle;
        this.category = category;
        this.publishTime = publishTime;
        this.kind = kind;
        this.area =area;
        this.formaled = formaled;
    }

    @ApiModelProperty("设计编号")
    private String designNo;
    @ApiModelProperty("火热度")
    private Integer hotLevel;
    @ApiModelProperty("设计标题")
    private String title;
    @ApiModelProperty("文章内容大纲")
    private String contentSyllabus;
    @ApiModelProperty("推荐户型")
    private String houseType;
    @ApiModelProperty("是否有效")
    private boolean valid;
    @ApiModelProperty("设计师id")
    private String designer;
    @ApiModelProperty("设计师姓名")
    private String designerName;
    @ApiModelProperty("设计师类型")
    private String designerType;
    @ApiModelProperty("酷家乐连接")
    private String panorama;
    @ApiModelProperty("展示等级")
    private DesignShowLevel showLevel;
    @ApiModelProperty("发布人身份")
    private DesignCreatorIdentity creatorIdentity;
    @ApiModelProperty("最高价格")
    @JsonSerialize(using= DecimalSerializer.class)
    private BigDecimal hprice;
    @ApiModelProperty("最低价格")
    @JsonSerialize(using= DecimalSerializer.class)
    private BigDecimal lprice;
    @ApiModelProperty("一口价")
    @JsonSerialize(using= DecimalSerializer.class)
    private BigDecimal fprice;
    @ApiModelProperty("设计显示封面")
    private String cover;
    @ApiModelProperty("详细描述文章id")
    private String describeArticle;
    @ApiModelProperty("二维码链接地址")
    private String qrCodeLink;
    @ApiModelProperty("专题类别")
    private WechatCategory category;
    @ApiModelProperty("专题ID")
    private String topicId;
    @ApiModelProperty("查看数")
    private int viewNum;
    @ApiModelProperty("收藏数")
    private int collectNum;
    @ApiModelProperty("分享数")
    private int shareNum;
    @ApiModelProperty("点赞数")
    private int praiseNum;
    @ApiModelProperty("排序字段")
    private int sorted;
    @ApiModelProperty("报名人数")
    private int signupNum;
    @ApiModelProperty(value = "发布时间", hidden = true)
    private LocalDateTime publishTime;
    @ApiModelProperty("种类")
    private String kind;
    @ApiModelProperty("面积")
    private Integer area;

    @ApiModelProperty("微信小程序导航栏颜色")
    private String navigationBarBackgroundColor;
    @ApiModelProperty("分享海报")
    private String poster;
    @ApiModelProperty("按钮图标")
    private String btnIcon;
    @ApiModelProperty("按钮文字")
    private String btnText;
    @ApiModelProperty("按钮链接")
    private String btnOnclickUrl;
    @ApiModelProperty("按钮链接参数")
    private String btnOnclickParams;
    @ApiModelProperty("模板id")
    private String templateId;

    @ApiModelProperty("是否为正式方案")
    private Boolean formaled = Boolean.TRUE;

    @ApiModelProperty("唯一编号")
    private String uniqueNo;

    @ApiModelProperty("文章内容模式")
    private String contentType = "rtf";

    @ApiModelProperty(value = "文章中图片数")
    private int imageNum;

    @ApiModelProperty(value = "背景图片url")
    private String bgImageUrl;
    @ApiModelProperty(value = "背景图片颜色")
    private String bgImageColor;
    @ApiModelProperty(value = "内容（配套文案）")
    private String matchedContent;

    @ApiModelProperty(value = "允许进行的分享方式")
    private String shareMethodAllowed;

    /**
     * 付费推广状态:1-开启/0-关闭
     */
    @ApiModelProperty(value = "付费推广状态:1-开启/0-关闭")
    private Boolean paidPromoteStaus;

    @ApiModelProperty(value = "目标（跳转）小程序appid,用于公众号内跳转小程序")
    private String targetAppId;
    @ApiModelProperty(value = "目标（跳转）小程序页面地址,公众号内跳转小程序页面")
    private String targetPagePath;

    @ApiModelProperty(hidden = true)
    private boolean praised;
    @ApiModelProperty(hidden = true)
    private boolean collected;
    @ApiModelProperty(hidden = true)
    private String praiseNumStr;
    @ApiModelProperty(hidden = true)
    private String collectNumStr;

    @ApiModelProperty(hidden = true)
    private String viewNumStr;
    @ApiModelProperty(hidden = true)
    private String shareNumStr;
    @ApiModelProperty(hidden = true)
    private String signupNumStr;

    @ApiModelProperty(value = "实际点赞量" ,hidden = true)
    private String actualPraiseNumStr;
    @ApiModelProperty(value = "实际收藏量",hidden = true)
    private String actualCollectNumStr;
    @ApiModelProperty(value = "(实际)浏览量",hidden = true)
    private String actualViewNumStr;
    @ApiModelProperty(value = "(实际)分享量",hidden = true)
    private String actualShareNumStr;
    @ApiModelProperty(value = "(实际)报名量",hidden = true)
    private String actualSignupNumStr;

    @ApiModelProperty(value = "虚拟点赞量" ,hidden = true)
    private String unrealPraiseNumStr;
    @ApiModelProperty(value = "虚拟收藏量",hidden = true)
    private String unrealCollectNumStr;
    @ApiModelProperty(value = "虚拟浏览量",hidden = true)
    private String unrealViewNumStr;
    @ApiModelProperty(value = "虚拟分享量",hidden = true)
    private String unrealShareNumStr;
    @ApiModelProperty(value = "(虚拟)报名量",hidden = true)
    private String unrealSignupNumStr;
}
