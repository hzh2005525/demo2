package com.sogal.wx.core.dao.domain.base;

import lombok.Data;

import java.util.Map;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */

@Data
public class WechatMessageBody extends BaseEntity{

    private WechatServer server;
    private WechatLogType type;
    private Map<String, Object> params;
    private WechatCategory category;

    public WechatMessageBody(){}

    public WechatMessageBody(WechatServer server, WechatLogType type, Map<String, Object> params, WechatCategory category){
        this.server = server;
        this.type = type;
        this.params = params;
        this.category = category;
    }

}
