package com.sogal.wx.core.dao.domain.mq;


import lombok.Getter;
import lombok.Setter;

import java.util.Map;


@Getter
@Setter
public class MsgBody {

    private MsgType msgType;
    private String serviceName;
    private Map<String, Object> params;
    public MsgBody(){

    }
    public MsgBody(MsgType msgType,String serviceName,Map<String,Object> params){
        this.msgType = msgType;
        this.serviceName = serviceName;
        this.params = params;
    };

}
