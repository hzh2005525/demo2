package com.sogal.wx.core.queue;

import com.sogal.wx.core.dao.domain.base.WechatMessageBody;
import com.sogal.wx.core.dao.domain.mq.MsgBody;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */
public interface AbstractProducer {

    void producer(WechatMessageBody messageBody);

    void producer(String key,String message);

    void producer(String key,MsgBody msgBody);

}
