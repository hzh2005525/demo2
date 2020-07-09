package com.sogal.wx.core.dao.domain.kefu;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatKeFu {


    private String ToUserName;

    private String FromUserName;

    private String CreateTime;

    private String MsgType;

    private String Content;

    private String MsgId;



}
