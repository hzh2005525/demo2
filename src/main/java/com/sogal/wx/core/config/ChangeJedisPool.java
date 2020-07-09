package com.sogal.wx.core.config;

import com.sogal.common.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisSentinelPool;

import javax.annotation.PostConstruct;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
public class ChangeJedisPool {

    @Autowired
    @Qualifier(value = "jedisPool1")
    private JedisSentinelPool jedisPool;

    @Autowired
    private JedisUtil jedisUtil;

    @PostConstruct
    public void change(){
        jedisUtil.setJedisSentinelPool(jedisPool);
    }
}
