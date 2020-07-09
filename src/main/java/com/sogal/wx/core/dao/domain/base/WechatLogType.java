package com.sogal.wx.core.dao.domain.base;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */
@Getter
public enum WechatLogType {

    TEST("测试日志"),
    USER_LOGIN("用户登录"),
    USER_REGISTER("用户注册"),
    USER_PER_INFO("访客完善信息升级用户级别"),
    USER_PER_ADDR_INFO("用户完善地址信息"),
    USER_SHARE_UNIQ("用户分享（用户与实体唯一）"),
    USER_SHARE_COUNT("用户分享（用户与实体多条）"),
    USER_QUERY_DESIGN_PAGE("用户列表查询设计方案"),
    USER_QUERY_DESIGN_DETAIL("用户查询设计方案详情"),
    USER_COLLECT("用户收藏"),
    CANCEL_COLLECT("用户取消收藏"),
    FOOTMARK("用户足迹"),
    CLEAR_FOOTMARK("清除用户足迹"),
    USER_CHECK_SHARE("用户查看分享"),
    USER_BROWSE("用户浏览时间"),
    USER_FILL_INFO("用户填写报名信息"),
    USER_COLLECT_SIGN("用户收藏标签"),
    CANCEL_COLLECT_SIGN("用户取消收藏标签"),
    MANUAL_RECEIVE_COUPON("用户手动领取优惠券");



    private final String name;

    WechatLogType(String name){
        this.name = name;
    }

}
