package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionContract extends BaseEntity {

    @ApiModelProperty("unionId")
    private String unionId;

    @ApiModelProperty("电子合同ID")
    private String aesId;

    @ApiModelProperty("状态,0:待审核;1:生效中;2:驳回;3:已到期;4:已失效;5:已终止")
    private Integer status;

    @ApiModelProperty("合同编号")
    private String contractNo;

    @ApiModelProperty("甲方名称")
    private String firstPartyName;

    @ApiModelProperty("乙方名称")
    private String secondPartyName;

    @ApiModelProperty("签署日期")
    private String signDt;

    @ApiModelProperty("失效日期")
    private String invalidDt;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("合同文件id")
    private String fileId;

    @ApiModelProperty("合同地址")
    private String fileUrl;

    @ApiModelProperty("创建人姓名")
    private String createName;

    @ApiModelProperty("创建时间")
    private String createDt;

}
