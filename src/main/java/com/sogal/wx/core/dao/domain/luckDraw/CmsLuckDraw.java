package com.sogal.wx.core.dao.domain.luckDraw;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 抽奖
 * @author: Liutl
 * @time: 2020/2/29 14:09
 */
@Data
public class CmsLuckDraw {

    private String id;

    //主题
    private String subject;
    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //背景图
    private String backgroundImage;
    //抽奖资格
    private String requirement;
    //抽奖次数上限
    private int requirementNumber;
    //用户抽奖次数
    private int userNum;
    //中奖公告
    private String notice;
    //抽奖规则
    private String rule;
    //发布状态
    private String status;
    //奖品图片
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
    private String image6;
    private String image7;
    private String image8;

    //系统时间
    private Date serverTime;


    //奖品集合
    private List<CmsLuckDrawPrize> prizes;
}
