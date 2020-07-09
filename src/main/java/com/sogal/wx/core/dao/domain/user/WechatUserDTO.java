package com.sogal.wx.core.dao.domain.user;


import com.sogal.wx.core.dao.domain.remark.WechatUserRemark;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class WechatUserDTO extends WechatUser {

    @ApiModelProperty("用户性别")
    private String sex;

    @ApiModelProperty(value = "分享人编号")
    private String sharerNo;

    @ApiModelProperty(value = "分享人姓名")
    private String sharerName;

    @ApiModelProperty(value = "分享人电话")
    private String sharerMobile;

    @ApiModelProperty("用户微信昵称")
    private String sharerNickName;

    @ApiModelProperty("备注")
    private List<WechatUserRemark> remarks;

    @ApiModelProperty("设计师认证状态")
    private String designerStatus;

    @ApiModelProperty("创薪合伙人认证状态,0:未认证;1:已认证")
    private Integer promotionStatus;

}
