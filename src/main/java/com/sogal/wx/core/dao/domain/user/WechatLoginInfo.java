package com.sogal.wx.core.dao.domain.user;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/19.
 */
@Getter
@Setter
public class WechatLoginInfo {

    private String code;

    private UserInfo userInfo;

}
