package com.sogal.wx.core.config;

import org.springframework.context.annotation.Bean;

/**
 * Created by xiaoxuwang on 2019/2/22.
 */
public class ChangeJedisPoolConfig {

    @Bean
    public ChangeJedisPool getChangeJedisPool(){
        return new ChangeJedisPool();
    }

}
