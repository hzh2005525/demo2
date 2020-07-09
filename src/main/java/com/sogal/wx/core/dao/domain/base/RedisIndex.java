package com.sogal.wx.core.dao.domain.base;

import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Getter
public enum RedisIndex {

    小程序登陆TOKEN("WECHAT:APPLET:TOKEN:%s"),
    日志队列("WECHAT:LOG:QUEUE"),
    小程序接口调用临时凭据("WECHAT:ACCESS:TOKEN:%s"),
    小程序接口调用临时凭据锁("WECHAT:ACCESS:TOKEN:LOCK"),

    微信JS接口调用临时票据("WECHAT:JSAPI:TICKET:%s"),
    卡券接口调用临时票据("WECHAT:CARDAPI:TICKET:%s"),

    用户登陆后SESSIONKEY("WECHAT:USER:SESSION:KEY:%s"),

    设计收藏总数("WECHAT:DESIGN:COLLECT:%s"),
    设计收藏总数锁("WECHAT:DESIGN:COLLECT:LOCK:%s"),
    用户收藏设计记录("WECHAT:COLLECT:USER:DESIGN:%s:%s"),

    设计点赞总数("WECHAT:DESIGN:PRAISE:%s"),
    设计点赞总数锁("WECHAT:DESIGN:PRAISE:LOCK:%s"),
    用户点赞设计记录("WECHAT:PRAISE:USER:DESIGN:%s:%s"),

    设计分享总数("WECHAT:DESIGN:SHARE:%s"),
    类型区分设计分享总数("WECHAT:DESIGN:SHARE:METHOD:%s:%s"),

    设计查看总数("WECHAT:DESIGN:VIEW:%s"),
    设计查看总数锁("WECHAT:DESIGN:VIEW:LOCK:%s"),
    用户查看设计记录("WECHAT:VIEW:USER:DESIGN:%s:%s"),

    FORM_ID引用("WECHAT:FORM_ID:%s:CATEGORY:%s:USER:%s"),
    FORM_ID栈("WECHAT:FORM_ID:CATEGORY:%s:USER:%s"),

    同步设计指标数开关("WECHAT:APPLET:SYNC:DESIGN:INDEX"),
    同步设计指标数开关锁("WECHAT:APPLET:SYNC:DESIGN:INDEX:LOCK"),

    同步北京合作方("WECHAT:ADMIN:ASYNC:DSP:COOPERATORS"),
    同步北京员工("WECHAT:ADMIN:ASYNC:DSP:EMPLOYEES"),
    同步北京员工组织机构信息("WECHAT:ADMIN:ASYNC:DSP:EMPLOYEES:COMPANY"),
    定时取消员工认证("WECHAT:ADMIN:AUTO:CANCEL:STAFF:BASE:AUTH"),
    定时取消合作方认证("WECHAT:ADMIN:AUTO:CANCEL:COOPERATOR:BASE:AUTH"),
    定时更新设计推荐("WECHAT:ADMIN:AUTO:DESIGN:RECOMMONED"),
    定时计算创薪合伙人奖励("WECHAT:ADMIN:AUTO:PROMOTION:REWARD"),
    定时计算创薪合伙人奖励对账("WECHAT:ADMIN:AUTO:PROMOTION:REWARD:DOCK:BILL"),
    定时计算创薪合伙人奖励结算("WECHAT:ADMIN:AUTO:PROMOTION:REWARD:SETTLE"),
    定时通知生成服务优惠券("WECHAT:ADMIN:AUTO:COUPON:SERVICE:GENERATE"),
    定时通知发放服务优惠券("WECHAT:ADMIN:AUTO:COUPON:SERVICE:ISSUE"),
    定时过期服务优惠券("WECHAT:ADMIN:AUTO:COUPON:SERVICE:EXPIRE"),
    定时好评服务预约("WECHAT:ADMIN:AUTO:EVALUATE:SERVICE"),
    定时处理微信企业付款系统异常("WECHAT:ADMIN:AUTO:WX:PROCESS:SYSTEMERROR"),

    标签收藏总数("WECHAT:SIGN:COLLECT:%s"),
    标签收藏总数锁("WECHAT:SIGN:COLLECT:LOCK:%s"),
    用户收藏标签记录("WECHAT:COLLECT:USER:SIGN:%s:%s"),

    修复最近推荐人开关锁("WECHAT:APPLET:RESTORE:LAST:SERVANT:LOCK"),
    DSP传输客户订单数据锁("WECHAT:APPLET:SYNC:DSP:ORDER:LOCK"),

    薪辐社合同模板("WECHAT:APPLET:MJCX:XFS:TEMPLATE"),

    SAVE_FORM_ID_KEY("WECHAT:FORM_ID:USER:OPENID:%s"),
    EXPOSE_REWARD_ACTIVITYID("WECHAT:EXPOSE:REWARD:ACTIVITYID:%s"),
    APPLY_CASH_LOCK("WECHAT:APPLY:LOCK:USERID:%s"),
    定时计算曝光奖励("WECHAT:CALCULATE:AUTO:EXPOSE:REWARD"),
    定时推送订阅消息("WECHAT:SEND:AUTO:SUBSCRIBE:MESSAGE"),
    IP定位开关("WECHAT:ADMIN:LOCK:IP:LOCATE"),
    定时通知推送需要获取地址的IP("WECHAT:ADMIN:AUTO:IP:LOCATE:SEND"),;

    private final String index;

    RedisIndex(String index) {
        this.index = index;
    }
}
