package com.sogal.wx.core.dao.domain.user;


import com.sogal.wx.core.dao.domain.promotion.UserBasicInfo;
import com.sogal.wx.core.dao.domain.remark.WechatUserRemark;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class WechatUserDetailDTO extends WechatUser {

    @ApiModelProperty("用户性别")
    private String sex;

    @ApiModelProperty(value = "分享人编号")
    private String sharerNo;

    @ApiModelProperty(value = "分享人姓名")
    private String sharerName;

    @ApiModelProperty(value = "分享人电话")
    private String sharerMobile;

    @ApiModelProperty("用户微信昵称")
    private String sharerNickName;

    private List<WechatUserRemark> remarks;

    @ApiModelProperty("用户总点击次数")
    private int totalClickNum;

    @ApiModelProperty("用户总访问时长")
    private Long totalBrowseTime;

    @ApiModelProperty("用户最后访问时间")
    private LocalDateTime lastVisitTime;

    @ApiModelProperty("用户最近访问时长")
    private Long lastBrowseTime;

    @ApiModelProperty("用户喜欢的设计id")
    private String designIdLoving;

    //首次分享人ID
    private String firstSharerId;
    //首次分享人用户编号
    private String firstSharerNo;
    //首次分享人昵称
    private String firstSharerNickName;
    //首次分享人姓名
    private String firstSharerName;
    //最近分享人ID
    private String latestSharerId;
    //最近分享人用户编号
    private String latestSharerNo;
    //最近分享人昵称
    private String latestSharerNickName;
    //最近分享人名称
    private String latestSharerName;


    @ApiModelProperty("设计师名字")
    private String designerName;

    @ApiModelProperty("级别")
    private String designerLevel;

    @ApiModelProperty("所属公司或门店")
    private String designerCompany;

    @ApiModelProperty("设计师头像")
    private String designerAvatarUrl;

    @ApiModelProperty("设计师身份类别")
    private String distinguish;

    @ApiModelProperty("设计师填写地址信息")
    private String designerAddr;

    @ApiModelProperty("简介")
    private String designerBriefIntroduction;

    @ApiModelProperty("风格")
    private String designerStyle;

    private String designerStatus;

    private int designNum;
    @ApiModelProperty(value = "实际点赞量", hidden = true)
    private String actualPraiseNumStr;
    @ApiModelProperty(value = "实际收藏量", hidden = true)
    private String actualCollectNumStr;

    @ApiModelProperty("创薪合伙人认证状态,0:未认证;1:已认证")
    private Integer promotionStatus;

    @ApiModelProperty(value = "创薪合伙人身份")
    private String promotionPosition;

    @ApiModelProperty("附件")
    private String positionUrl;

    @ApiModelProperty(value = "创薪合伙人推荐者编号")
    private String promotionRecommendNo;

    @ApiModelProperty(value = "创薪合伙人来源")
    private String promotionSource;

    @ApiModelProperty(value = "创薪合伙人认证时间")
    private LocalDateTime promotionTimeCreated;

    @ApiModelProperty("创薪合伙人推荐者信息")
    private UserBasicInfo recommendInfo;

    @ApiModelProperty("创薪合伙人级别,LV0:青铜;LV1:白银;LV2:黄金")
    private String promotionLevel;

    @ApiModelProperty(value = "创薪合伙人认证姓名")
    private String promotionRealName;

    @ApiModelProperty(value = "创薪合伙人认证身份证")
    private String promotionIdentityCode;

    @ApiModelProperty(value = "创薪合伙人绑定银行卡")
    private String promotionAccountNo;

    @ApiModelProperty(value = "创薪合伙人绑定银行卡所属银行")
    private String promotionAccountBank;

    @ApiModelProperty(value = "创薪合伙人合同签署日期")
    private String promotionSignDt;

    @ApiModelProperty(value = "创薪合伙人合同失效日期")
    private String promotionInvalidDt;

}
