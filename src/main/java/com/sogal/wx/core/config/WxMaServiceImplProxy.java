package com.sogal.wx.core.config;

import cn.binarywang.wx.miniapp.api.*;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import com.sogal.common.util.AbstractJedis;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import com.sogal.wx.core.tool.SecKillLockManager;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.http.HttpType;
import me.chanjar.weixin.common.util.http.RequestExecutor;
import me.chanjar.weixin.common.util.http.RequestHttp;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * Created by xiaoxuwang on 2019/2/26.
 */
public class WxMaServiceImplProxy implements WxMaService, RequestHttp<CloseableHttpClient, HttpHost> {

    private WxMaServiceImpl wxMaService;

    private SecKillLockManager secKillLockManager;

    private AbstractJedis jedisUtil;

    public WxMaServiceImplProxy(WxMaServiceImpl wxMaService, AbstractJedis jedisUtil){
        this.wxMaService = wxMaService;
        this.jedisUtil = jedisUtil;
        this.secKillLockManager = new SecKillLockManager(jedisUtil);
    }


    @Override
    public WxMaJscode2SessionResult jsCode2SessionInfo(String s) throws WxErrorException {
        return wxMaService.jsCode2SessionInfo(s);
    }

    @Override
    public boolean checkSignature(String s, String s1, String s2) {
        return wxMaService.checkSignature(s, s1, s2);
    }

    @Override
    public String getAccessToken() throws WxErrorException {
        return this.getAccessToken(false);
    }

    @Override
    public String getAccessToken(boolean b) throws WxErrorException {
        try {
            secKillLockManager.lock(RedisIndex.小程序接口调用临时凭据锁.getIndex());
            return wxMaService.getAccessToken(b);
        }finally {
            secKillLockManager.unlock(RedisIndex.小程序接口调用临时凭据锁.getIndex());
        }
    }

    @Override
    public String get(String s, String s1) throws WxErrorException {
        return wxMaService.get(s, s1);
    }

    @Override
    public String post(String s, String s1) throws WxErrorException {
        return wxMaService.post(s, s1);
    }

    @Override
    public <T, E> T execute(RequestExecutor<T, E> requestExecutor, String s, E e) throws WxErrorException {
        return wxMaService.execute(requestExecutor, s, e);
    }

    @Override
    public void setRetrySleepMillis(int i) {
        wxMaService.setRetrySleepMillis(i);
    }

    @Override
    public void setMaxRetryTimes(int i) {
        wxMaService.setMaxRetryTimes(i);
    }

    @Override
    public WxMaConfig getWxMaConfig() {
        return wxMaService.getWxMaConfig();
    }

    @Override
    public void setWxMaConfig(WxMaConfig wxMaConfig) {
        wxMaService.setWxMaConfig(wxMaConfig);
    }

    @Override
    public WxMaMsgService getMsgService() {
        return wxMaService.getMsgService();
    }

    @Override
    public WxMaMediaService getMediaService() {
        return wxMaService.getMediaService();
    }

    @Override
    public WxMaUserService getUserService() {
        return wxMaService.getUserService();
    }

    @Override
    public WxMaQrcodeService getQrcodeService() {
        return wxMaService.getQrcodeService();
    }

    @Override
    public WxMaTemplateService getTemplateService() {
        return wxMaService.getTemplateService();
    }

    @Override
    public WxMaAnalysisService getAnalysisService() {
        return wxMaService.getAnalysisService();
    }

    @Override
    public WxMaCodeService getCodeService() {
        return wxMaService.getCodeService();
    }

    @Override
    public WxMaJsapiService getJsapiService() {
        return wxMaService.getJsapiService();
    }

    @Override
    public WxMaSettingService getSettingService() {
        return wxMaService.getSettingService();
    }

    @Override
    public CloseableHttpClient getRequestHttpClient() {
        return wxMaService.getRequestHttpClient();
    }

    @Override
    public HttpHost getRequestHttpProxy() {
        return wxMaService.getRequestHttpProxy();
    }

    @Override
    public HttpType getRequestType() {
        return wxMaService.getRequestType();
    }

    @Override
    public WxMaShareService getShareService() {
        return wxMaService.getShareService();
    }

    @Override
    public WxMaRunService getRunService() {
        return wxMaService.getRunService();
    }

    @Override
    public WxMaSecCheckService getSecCheckService() {
        return wxMaService.getSecCheckService();
    }

    @Override
    public void initHttp() {
        wxMaService.initHttp();
    }

    @Override
    public RequestHttp getRequestHttp() {
        return wxMaService.getRequestHttp();
    }


}
