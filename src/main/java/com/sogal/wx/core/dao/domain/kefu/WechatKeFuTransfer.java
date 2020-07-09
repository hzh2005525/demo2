package com.sogal.wx.core.dao.domain.kefu;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatKeFuTransfer {


    private String ToUserName;

    private String FromUserName;

    private String CreateTime;

    private String MsgType;


}
