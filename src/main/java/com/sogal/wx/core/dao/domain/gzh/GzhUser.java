package com.sogal.wx.core.dao.domain.gzh;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class GzhUser {

    private String id;
    // 用户的标识
    private String openid;
    // 关注状态（1是关注，0是未关注），未关注时获取不到其余信息
    private int subscribe;
    // 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
    private String subscribeTime;
    // 昵称
    private String nickname;
    // 用户的性别（1是男性，2是女性，0是未知）
    private int sex;
    // 用户所在国家
    private String country;
    // 用户所在省份
    private String province;
    // 用户所在城市
    private String city;
    // 用户的语言，简体中文为zh_CN
    private String language;
    // 用户头像
    private String headImgUrl;
    // 关注的渠道来源
    private String subscribeScene;

    private String unionid;
    //推荐人
    private String referrer;
    //最新推荐人
    private String lastReferrer;
    //备注
    private String remarks;
    //所属公众号
    private String gzhId;

}