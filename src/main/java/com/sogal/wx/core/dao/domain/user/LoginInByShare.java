package com.sogal.wx.core.dao.domain.user;


import com.sogal.wx.core.dao.domain.base.WechatRealm;
import com.sogal.wx.core.dao.domain.share.ShareMethod;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/11.
 */
@Data
public class LoginInByShare {

    @ApiModelProperty("用户基本信息")
    private WechatLoginInfo wechatLoginInfo;
    @ApiModelProperty("分享方式")
    private ShareMethod method;
    @ApiModelProperty("分享实体")
    private WechatRealm realm;
    @ApiModelProperty("分享者编号")
    private String realmSharerNo;
    @ApiModelProperty("分享实体编号")
    private String realmShareNo;
    @ApiModelProperty(hidden = true)
    private String checkerNo;
    @ApiModelProperty(hidden = true)
    private String checkerId;
    @ApiModelProperty(hidden = true)
    private String newbee;
    /**
     * 与查看分享、扫码分享关联id
     */
    private String shareRecordId;

    private String ip;

}
