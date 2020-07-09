package com.sogal.wx.core.dao.domain.base;

import com.sogal.wx.core.qrcode.QRCodeRealmType;
import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
public enum WechatRealm {

    WECHAT_DESIGN("设计方案库表", QRCodeRealmType.D),
    WECHAT_BANNER("轮播图表", QRCodeRealmType.B),
    WECHAT_SHARE("用户分享表"),
    WECHAT_TOPIC("专题表",QRCodeRealmType.T),
    WECHAT_SIGN("标签表"),
    SOGAL_INDEX("全屋定制主页"),
    WK_INDEX("局部翻新主页"),
    SOGAL_LIST("全屋定制列表"),
    WK_LIST("局部翻新列表"),
    USER_INFO("个人详情页"),
    WECHAT_DESIGN_C("设计酷家乐分享"),
    ACT_ENTER_INDEX("活动报名页"),
    PICTORIAL("画报"),

    //表名重命名之后
    CMS_ARTICLE("文章表", QRCodeRealmType.D),
    MP_SERVICE_FINISH("服务预约交单"),
    MP_SERVICE_EVALUATE("服务评价");

    private final String name;
    private QRCodeRealmType type;

    WechatRealm(String name){
        this.name = name;
    }

    WechatRealm(String name, QRCodeRealmType type){
        this.name = name;
        this.type = type;
    }

}
