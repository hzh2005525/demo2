package com.sogal.wx.core.queue;

import com.sogal.common.exception.BizException;
import com.sogal.common.util.AbstractJedis;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import com.sogal.wx.core.error.WechatCoreError;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */
@Setter
@Slf4j
public class RedisMQConsumer implements AbstractConsumer{

    private AbstractJedis jedis;

    private boolean flag = Boolean.TRUE;

    public RedisMQConsumer(AbstractJedis jedis){
        if(null == this.jedis) {
            this.jedis = jedis;
        }
    }

    @Override
    public String consumer() throws BizException {
        if(flag) {
            List<String> message = null;
            try {
                message = jedis.consumer(RedisIndex.日志队列.getIndex());
            }catch (Exception e){
                log.error(WechatCoreError.GET_LOG_ERROR.getMessage(), e);
                throw new BizException(WechatCoreError.GET_LOG_ERROR);
            }
            if (message == null) return null;
            return message.get(1);
        }
        return null;
    }

    @Override
    public String consumer(String redismqKey){
        if(flag) {
            List<String> message = jedis.consumer(redismqKey);
            if (message == null) return null;
            return message.get(1);
        }
        return null;
    }
}
