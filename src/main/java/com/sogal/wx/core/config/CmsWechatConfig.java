package com.sogal.wx.core.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import com.sogal.common.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class CmsWechatConfig {

    @Value("${applet.wechat.app-id}")
    private String appId;

    @Value("${applet.wechat.app-secret}")
    private String appSecret;

    @Autowired
    private JedisUtil jedisUtil;

    @Bean
    public WxMaConfig wxCmsMaConfig() {
        WechatInRedisConfig config = new WechatInRedisConfig(jedisUtil);
        config.setAppid(appId);
        config.setSecret(appSecret);
        return config;
    }

    @Bean
    public WxMaService wxCmsMaService(@Qualifier("wxCmsMaConfig") WxMaConfig maConfig) {
        WxMaService service = new WxMaServiceImplProxy(new WxMaServiceImpl(), jedisUtil);
        service.setWxMaConfig(maConfig);
        return service;
    }

}
