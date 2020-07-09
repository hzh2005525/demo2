package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserAuthPromotion extends BaseEntity {

    @ApiModelProperty("用户unionId")
    private String unionId;

    @ApiModelProperty("推荐者编号")
    private String recommendNo;

    @ApiModelProperty("注册名称")
    private String name;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("身份属性")
    private String position;

    @ApiModelProperty("附件")
    private String positionUrl;

    @ApiModelProperty("来源")
    private String source;

    @ApiModelProperty("审核状态,0:待审核;1:审核通过;2:审核不通过")
    private Integer status;

    /**
     * 集客人(用于dsp转化客户)
     */
    private String collectGuestId;

    /**
     * 集客人在当前链路中的层级
     */
    private Integer collectGuestLevel;

    @ApiModelProperty("级别,LV0:青铜;LV1:白银;LV2:黄金")
    private String level;

    @ApiModelProperty("认证状态,0:未认证;1:已认证")
    private Integer authStatus;

    @ApiModelProperty("认证时间")
    private LocalDateTime authTime;

    @ApiModelProperty("自动解除,0:未解除;1:已解除")
    private Integer autoEvict;

    @ApiModelProperty("解除原因")
    private String evictReason;

}
