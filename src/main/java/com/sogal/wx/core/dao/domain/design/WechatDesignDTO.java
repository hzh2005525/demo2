package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.article.CMSArticlePlainText;
import com.sogal.wx.core.dao.domain.article.WechatArticle;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import com.sogal.wx.core.dao.domain.sign.BindingSignResultEntity;
import com.sogal.wx.core.dao.domain.sign.BindingSignsDTO;
import com.sogal.wx.core.dao.domain.sign.SignDTO;
import com.sogal.wx.core.dao.domain.sign.WechatSysSign;
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
public class WechatDesignDTO extends WechatDesign{

    private WechatImage wechatImage;

    private WechatImage posterImage;

    private WechatArticle wechatArticle;

    private List<SignDTO> signs;

    private String imageUrl;

    private String reduceUrl;

    private String contentSyllabus;

    private int imageNum;

    private Boolean signCollected;

    private BindingSignsDTO bindingSigns;

    private String designerAvatarUrl;

    private List<CMSArticlePlainText> paragraphs;

    @ApiModelProperty("奖励类型,1:随机奖励;2:固定奖励")
    private Integer rewardType;

    @ApiModelProperty("随机最小奖励")
    private BigDecimal randomMinReward;

    @ApiModelProperty("随机最大奖励")
    private BigDecimal randomMaxReward;

    @ApiModelProperty("固定奖励")
    private BigDecimal fixReward;

    @ApiModelProperty("地区")
    private List<String> areas;

    @ApiModelProperty(value = "开始时间")
    private Date beginTime;

    @ApiModelProperty(value = "结束时间")
    private Date endTime;

}
