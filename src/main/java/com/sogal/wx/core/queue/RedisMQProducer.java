package com.sogal.wx.core.queue;


import com.google.gson.Gson;
import com.sogal.common.util.AbstractJedis;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import com.sogal.wx.core.dao.domain.base.WechatMessageBody;
import com.sogal.wx.core.dao.domain.mq.MsgBody;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */
public class RedisMQProducer implements AbstractProducer{

    private AbstractJedis jedis;

    private Gson gson;

    public RedisMQProducer(AbstractJedis jedis, Gson gson){
        if(null == this.jedis) {
            this.jedis = jedis;
        }
        if(null == this.gson){
            this.gson = gson;
        }
    }

    @Override
    public void producer(WechatMessageBody messageBody) {
        jedis.producer(RedisIndex.日志队列.getIndex(), gson.toJson(messageBody));
    }

    @Override
    public void producer(String key, String message) {
        jedis.producer(key, message);
    }

    @Override
    public void producer(String redismqKey, MsgBody msgBody) {
        jedis.producer(redismqKey,gson.toJson(msgBody));
    }
}
