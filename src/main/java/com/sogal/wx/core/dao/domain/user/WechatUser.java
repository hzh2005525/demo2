package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatUser extends BaseEntity{

    public WechatUser(){}

    public WechatUser(String openId, String nickName, Byte gender, WechatCategory category){
        this.openId = openId;
        this.nickName = nickName;
        this.gender = gender;
        this.level = UserLevel.VISITOR;
        this.category = category;
    }
    public WechatUser(String unionId,String openId, String nickName, Byte gender, WechatCategory category){
        this.unionId = unionId;
        this.openId = openId;
        this.nickName = nickName;
        this.gender = gender;
        this.level = UserLevel.VISITOR;
        this.category = category;
    }

    @ApiModelProperty("手机号")
    private String mobile;
    @ApiModelProperty("用户类别")
    private UserLevel level;
    @ApiModelProperty("用户openId")
    private String openId;
    @ApiModelProperty("用户unionId")
    private String unionId;
    @ApiModelProperty("用户微信昵称")
    private String nickName;
    @ApiModelProperty("用户性别")
    private Byte gender;
    @ApiModelProperty("用户编号")
    private String userNo;
    @ApiModelProperty("会员服务码")
    private String vipCode;
    @ApiModelProperty(hidden = true)
    private String createTime;

    private WechatCategory category;
    @ApiModelProperty("用户微信头像")
    private String avatarUrl;
    @ApiModelProperty("推广大使名字")
    private String name;
    @ApiModelProperty("推广大使手机号")
    private String authMobile;
    private Boolean isEmissary;
    private String emissaryType;
    @ApiModelProperty("认证设计师关系id")
    private String designerId;
    private String agreement;

    @ApiModelProperty("经销商编码")
    private String dealerCode;

    @ApiModelProperty("经销商ID")
    private String repoId;

    @ApiModelProperty("用户定位所在省")
    private String userProvince;
    @ApiModelProperty("用户定位所在市")
    private String userCity;
    @ApiModelProperty("用户定位所在区")
    private String userArea;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("微信账号设置国家")
    private String mpCountry;
    @ApiModelProperty("微信账号设置省")
    private String mpProvince;
    @ApiModelProperty("微信账号设置市")
    private String mpCity;
    @ApiModelProperty("来源场景值(授权时场景值)")
    private String sceneValue;

    /**
     * 关注状态（1是关注，0是未关注），未关注时获取不到其余信息
     */
    private int subscribe;
    /**
     * 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     */
    private String subscribeTime;
    /**
     * 关注的渠道来源
     */
    private String subscribeScene;

    /**
     * 所属公众号
     */
    private String gzhId;
    /**
     * DSP用户ID
     */
    private String dspUserId;
    /**
     * DSP用户手机号
     */
    private String dspUserMobile;

    public WechatUser(String unionId, String openId, String nickName, Byte gender, WechatCategory category,
                      String sceneValue) {
        this.unionId = unionId;
        this.openId = openId;
        this.nickName = nickName;
        this.gender = gender;
        this.level = UserLevel.VISITOR;
        this.category = category;
        this.sceneValue = sceneValue;
    }

    public void setTimeCreated(LocalDateTime timeCreated){
        super.setTimeCreated(timeCreated);
        if(timeCreated!=null) {
            createTime = timeCreated.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }

}
