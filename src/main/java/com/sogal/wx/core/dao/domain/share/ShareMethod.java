package com.sogal.wx.core.dao.domain.share;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/3/1.
 */
@Getter
public enum ShareMethod {

    QRCODE("二维码"),
    CARD("分享卡"),
    CMSQRCODE("CMS二维码"),
    MY_CARD("我的名片"),
    WECHAT_SERVICE_ACCOUNT("微信公众号"),
    POSTER_QRCODE("海报二维码"),
    PICTORIAL_QRCODE("画报二维码");

    private final String name;

    ShareMethod(String name) {
        this.name = name;
    }
}
