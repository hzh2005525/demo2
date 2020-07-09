package com.sogal.wx.core.dao.domain.luckDraw;

import com.sogal.common.domain.order.CouponType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @description: 抽奖_奖品
 * @author: Liutl
 * @time: 2020/2/29 17:16
 */
@Data
public class CmsLuckDrawPrize {

    private String id;
    private String parentId;
    //奖品类型  GOODS 物品劵
    @NotNull
    private CouponType type;
    //奖品名称
    private String name;
    //奖品数量
    private int num;
    //剩余奖品数量
    private int useNum;
    //代金券金额
    private BigDecimal amount;
    //中奖率
    private BigDecimal winningRate;
    //奖品图片
    private String image;
    //排序
    private int sort;
    //用户抽奖次数
    private int userNum;

    //dsp劵ID
    private String dspCouponId;

}
