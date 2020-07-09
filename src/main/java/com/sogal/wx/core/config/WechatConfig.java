package com.sogal.wx.core.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import com.sogal.common.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * Created by xiaoxuwang on 2019/2/19.
 */
public class WechatConfig {

    @Value("${applet.wechat.wkc.app-id}")
    private String wkcAppId;

    @Value("${applet.wechat.qwc.app-id}")
    private String qwcAppId;

    @Value("${applet.wechat.mjc.app-id}")
    private String mjcAppId;

    @Value("${applet.wechat.wkc.app-secret}")
    private String wkcAppSecret;

    @Value("${applet.wechat.qwc.app-secret}")
    private String qwcAppSecret;

    @Value("${applet.wechat.mjc.app-secret}")
    private String mjcAppSecret;

    @Autowired
    private JedisUtil jedisUtil;

    @Bean
    public WxMaConfig wxWkcMaConfig() {
        WechatInRedisConfig config = new WechatInRedisConfig(jedisUtil);
        config.setAppid(wkcAppId);
        config.setSecret(wkcAppSecret);
        return config;
    }

    @Bean
    public WxMaConfig wxQwcMaConfig() {
        WechatInRedisConfig config = new WechatInRedisConfig(jedisUtil);
        config.setAppid(qwcAppId);
        config.setSecret(qwcAppSecret);
        return config;
    }

    @Bean
    public WxMaConfig wxMjcMaConfig() {
        WechatInRedisConfig config = new WechatInRedisConfig(jedisUtil);
        config.setAppid(mjcAppId);
        config.setSecret(mjcAppSecret);
        return config;
    }

    @Bean
    public WxMaService wxWkcMaService(@Qualifier("wxWkcMaConfig") WxMaConfig maConfig) {
        WxMaService service = new WxMaServiceImplProxy(new WxMaServiceImpl(), jedisUtil);
        service.setWxMaConfig(maConfig);
        return service;
    }

    @Bean
    public WxMaService wxQwcMaService(@Qualifier("wxQwcMaConfig") WxMaConfig maConfig) {
        WxMaService service = new WxMaServiceImplProxy(new WxMaServiceImpl(), jedisUtil);
        service.setWxMaConfig(maConfig);
        return service;
    }

    @Bean
    public WxMaService wxMjcMaService(@Qualifier("wxMjcMaConfig") WxMaConfig maConfig) {
        WxMaService service = new WxMaServiceImplProxy(new WxMaServiceImpl(), jedisUtil);
        service.setWxMaConfig(maConfig);
        return service;
    }

}
