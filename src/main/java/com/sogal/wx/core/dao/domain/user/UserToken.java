package com.sogal.wx.core.dao.domain.user;


import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Data
public class UserToken {

    private String token;
    private String userNo;
    private String defaultEmptyListImageUrl;
    /**
     * 微信(小程序、公众号、app )openId
     */
    private String openId;
}
