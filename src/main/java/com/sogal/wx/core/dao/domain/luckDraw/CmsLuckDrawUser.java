package com.sogal.wx.core.dao.domain.luckDraw;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: Liutl
 * @time: 2020/3/3 14:27
 */

@Data
public class CmsLuckDrawUser {


    private String id;

    private String userId;

    private String name;
    //手机号
    private String mobile;
    // 有效期
    private Date validityDate;
    //使用日期
    private Date drawDate;
    //使用状态
    private String useStatus;
    //奖品ID
    private String prizeId;
    //抽奖ID
    private String luckId;
    //中奖状态
    private String drawStatus;
    //发货备注
    private String remark;
    //根据ID获取的城市
    private String city;
    private String ip;


    //cmsLuckDrawPrize表
    //奖品类型
    private String type;
    //奖品名称
    private String prizeName;
    //图片
    private String image;

    private String dspCouponId;

    private String dspStatus;

    //头像
    private String avatarUrl;


}
