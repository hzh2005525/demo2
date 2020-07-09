package com.sogal.wx.core.dao.domain.banner;


import com.sogal.wx.core.dao.domain.image.WechatImage;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by xiaoxuwang on 2019/3/4.
 */
@Getter
@Setter
public class BannerDTO extends WechatBanner{

    private WechatImage wechatImage;
}
