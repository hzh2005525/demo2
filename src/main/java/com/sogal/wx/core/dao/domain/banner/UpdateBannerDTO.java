package com.sogal.wx.core.dao.domain.banner;

import com.sogal.wx.core.dao.domain.image.WechatImage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBannerDTO extends WechatBanner {
    private WechatImage wechatImage;
    private String id;

}
