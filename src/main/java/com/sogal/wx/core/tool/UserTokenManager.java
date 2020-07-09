package com.sogal.wx.core.tool;

import com.google.gson.Gson;
import com.sogal.common.exception.BizException;
import com.sogal.common.util.JedisUtil;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.domain.user.UserToken;
import com.sogal.wx.core.error.WechatCoreError;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Component
public class UserTokenManager {

    @Autowired
    private Gson gson;

    @Autowired
    private JedisUtil jedisUtil;


    public UserLoginToken getAppletUserLoginInfo(String token)throws BizException{
        if(StringUtils.isBlank(token)){
            throw new BizException(WechatCoreError.WITH_TOKEN);
        }
        String key = String.format(String.format(RedisIndex.小程序登陆TOKEN.getIndex(), token));
        String tokenContent = jedisUtil.get(key);
        if(StringUtils.isBlank(tokenContent)){
            throw new BizException(WechatCoreError.WITHOUT_LOGIN);
        }
        return gson.fromJson(tokenContent, UserLoginToken.class);
    }

    public UserToken generateAppletUserToken(UserLoginToken userLoginToken)throws BizException {
//        String token = RandowCharTool.getRandomString(32);
        String token = MD5Tool.MD5(userLoginToken.getWechatUser().getId() + userLoginToken.getCategory().name());
        UserToken userToken = new UserToken();
        userToken.setToken(token);
        userToken.setUserNo(userLoginToken.getWechatUser().getUserNo());
        userToken.setOpenId(userLoginToken.getWechatUser().getOpenId());
        jedisUtil.set(String.format(RedisIndex.小程序登陆TOKEN.getIndex(), token), gson.toJson(userLoginToken), GlobalConstantValue.EXPIRE_TIME);
        return userToken;
    }


    public String getUserToken(String userId,WechatCategory category) throws BizException {
            return MD5Tool.MD5(userId + category.name());
    }


}
