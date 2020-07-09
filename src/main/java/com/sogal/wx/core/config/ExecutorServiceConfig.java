package com.sogal.wx.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiaoxuwang on 2019/3/19.
 */
@Configuration
public class ExecutorServiceConfig {

    @Bean
    public ExecutorService getExecutorService(){
        return Executors.newCachedThreadPool();
    }

}
