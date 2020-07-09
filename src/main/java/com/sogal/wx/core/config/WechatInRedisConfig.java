package com.sogal.wx.core.config;

import cn.binarywang.wx.miniapp.config.WxMaConfig;
import com.sogal.common.util.AbstractJedis;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import lombok.Data;
import me.chanjar.weixin.common.bean.WxAccessToken;
import me.chanjar.weixin.common.util.http.apache.ApacheHttpClientBuilder;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiaoxuwang on 2019/2/26.
 */
@Data
public class WechatInRedisConfig implements WxMaConfig {

    private AbstractJedis jedisUtil;
    protected volatile String msgDataFormat;
    protected volatile String appid;
    protected volatile String secret;
    protected volatile String token;
    protected volatile String aesKey;
    protected volatile long expiresTime;
    protected volatile String httpProxyHost;
    protected volatile int httpProxyPort;
    protected volatile String httpProxyUsername;
    protected volatile String httpProxyPassword;
    protected Lock accessTokenLock = new ReentrantLock();
    protected Lock jsapiTicketLock = new ReentrantLock();
    protected Lock cardApiTicketLock = new ReentrantLock();
    protected volatile File tmpDirFile;
    protected volatile ApacheHttpClientBuilder apacheHttpClientBuilder;

    public WechatInRedisConfig(AbstractJedis jedisUtil){
        this.jedisUtil = jedisUtil;
    }

    @Override
    public String getAccessToken() {
        return jedisUtil.get(String.format(RedisIndex.小程序接口调用临时凭据.getIndex(), appid));
    }

    @Override
    public Lock getAccessTokenLock() {
        return this.accessTokenLock;
    }

    @Override
    public boolean isAccessTokenExpired() {
        return jedisUtil.getTTL(String.format(RedisIndex.小程序接口调用临时凭据.getIndex(), appid)) < 10;
    }

    @Override
    public void expireAccessToken() {
        jedisUtil.del(String.format(RedisIndex.小程序接口调用临时凭据.getIndex(), appid));
    }

    @Override
    public synchronized void updateAccessToken(WxAccessToken wxAccessToken) {
        this.updateAccessToken(wxAccessToken.getAccessToken(), wxAccessToken.getExpiresIn());
    }

    @Override
    public synchronized void updateAccessToken(String s, int i) {
        jedisUtil.set(String.format(RedisIndex.小程序接口调用临时凭据.getIndex(), appid), s, i);
    }

    @Override
    public String getJsapiTicket() {
        return jedisUtil.get(String.format(RedisIndex.微信JS接口调用临时票据.getIndex(), appid));
    }

    @Override
    public Lock getJsapiTicketLock() {
        return this.jsapiTicketLock;
    }

    @Override
    public boolean isJsapiTicketExpired() {
        return jedisUtil.getTTL(String.format(RedisIndex.微信JS接口调用临时票据.getIndex(),appid)) < 10;
    }

    @Override
    public void expireJsapiTicket() {
        jedisUtil.del(String.format(RedisIndex.微信JS接口调用临时票据.getIndex(),appid));
    }

    @Override
    public synchronized void updateJsapiTicket(String s, int i) {
        jedisUtil.set(String.format(RedisIndex.微信JS接口调用临时票据.getIndex(),appid), s, i);
    }

    @Override
    public String getCardApiTicket() {
        return jedisUtil.get(String.format(RedisIndex.卡券接口调用临时票据.getIndex(), appid));
    }

    @Override
    public Lock getCardApiTicketLock() {
        return this.cardApiTicketLock;
    }

    @Override
    public boolean isCardApiTicketExpired() {
        return jedisUtil.getTTL(String.format(RedisIndex.卡券接口调用临时票据.getIndex(), appid)) < 10;
    }

    @Override
    public void expireCardApiTicket() {
        jedisUtil.del(String.format(RedisIndex.卡券接口调用临时票据.getIndex(), appid));
    }

    @Override
    public synchronized void updateCardApiTicket(String s, int i) {
        jedisUtil.set(String.format(RedisIndex.卡券接口调用临时票据.getIndex(), appid), s, i);
    }

    @Override
    public boolean autoRefreshToken() {
        return true;
    }
}
