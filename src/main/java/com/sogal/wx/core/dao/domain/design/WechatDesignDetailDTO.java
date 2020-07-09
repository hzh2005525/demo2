package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.article.CMSArticlePlainText;
import com.sogal.wx.core.dao.domain.article.WechatArticleDTO;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import com.sogal.wx.core.dao.domain.sign.BindingSignResultEntity;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/3/2
 */
@Getter
@Setter
public class WechatDesignDetailDTO extends WechatDesign {

    private String topicTitle;
    private String topicSubTitle;
    private WechatArticleDTO wechatArticle;
    private UserLoginToken userLoginToken;
    private WechatImage wechatImage;
    private WechatImage posterImage;
    private CmsArticleRewardDTO cmsArticleRewardDTO;
    @ApiModelProperty(hidden = true)
    private List<BindingSignResultEntity> bindingSignResultEntities;
    private String visitBrowseId;

    @ApiModelProperty("设计师名字")
    private String designerNameAuthed;

    @ApiModelProperty("级别")
    private String designerLevel;

    @ApiModelProperty("所属公司或门店")
    private String designerCompany;

    @ApiModelProperty("设计师头像")
    private String designerAvatarUrl;

    @ApiModelProperty("设计师填写地址信息")
    private String designerAddr;

    private String designerStatus;

    private List<CMSArticlePlainText> paragraphs;

}
