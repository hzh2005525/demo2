package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.article.CMSArticlePlainText;
import com.sogal.wx.core.dao.domain.article.WechatArticle;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/2/27
 */
@Getter
@Setter
public class UpdateWechatDesignDTO {

    @ApiModelProperty("设计标题")
    private String title;
    @ApiModelProperty("推荐户型")
    private String houseType;
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
    @ApiModelProperty("最高价格")
    private String hprice;
    @ApiModelProperty("最低价格")
    private String lprice;
    @ApiModelProperty("一口价")
    private String fprice;
    @ApiModelProperty("设计显示封面")
    private String cover;
    @ApiModelProperty("二维码链接地址")
    private String qrCodeLink;
    @ApiModelProperty("专题类别")
    private WechatCategory category;
    @ApiModelProperty("专题ID")
    private String topicId;
    @ApiModelProperty("设计方案uuid")
    private String id;

    @ApiModelProperty("详细描述文章id")
    private String describeArticle;

    @ApiModelProperty("种类")
    private String kind;
    @ApiModelProperty("面积")
    private Integer area;
    @ApiModelProperty("微信小程序导航栏颜色")
    private String navigationBarBackgroundColor;

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
    @ApiModelProperty("唯一编号")
    private String uniqueNo;
    @ApiModelProperty("海报配图")
    private String poster;
    @ApiModelProperty("文章内容模式")
    private String contentType = "rtf";
    @ApiModelProperty(value = "文章内容大纲")
    private String contentSyllabus;

    @ApiModelProperty(value = "文章中图片数")
    private Integer imageNum;

    @ApiModelProperty(value = "背景图片url")
    private String bgImageUrl;
    @ApiModelProperty(value = "背景图片颜色")
    private String bgImageColor;
    @ApiModelProperty(value = "内容（配套文案）")
    private String matchedContent;

    @ApiModelProperty(value = "允许进行的分享方式")
    private String shareMethodAllowed;

    @ApiModelProperty(value = "付费推广状态:1-开启/0-关闭")
    private Boolean paidPromoteStaus;

    @ApiModelProperty("奖励类型,1:随机奖励;2:固定奖励")
    private Integer rewardType;

    @ApiModelProperty("随机最小奖励")
    private BigDecimal randomMinReward;

    @ApiModelProperty("随机最大奖励")
    private BigDecimal randomMaxReward;

    @ApiModelProperty("固定奖励")
    private BigDecimal fixReward;

    @ApiModelProperty(value = "目标（跳转）小程序appid,用于公众号内跳转小程序")
    private String targetAppId;
    @ApiModelProperty(value = "目标（跳转）小程序页面地址,公众号内跳转小程序页面")
    private String targetPagePath;


    @ApiModelProperty("地区")
    private List<String> areas;

    @ApiModelProperty(value = "开始时间")
    private Date beginTime;

    @ApiModelProperty(value = "结束时间")
    private Date endTime;

    private WechatImage wechatImage;

    private WechatArticle wechatArticle;

    private WechatImage posterImage;

    private List<CMSArticlePlainText> paragraphs;

}
