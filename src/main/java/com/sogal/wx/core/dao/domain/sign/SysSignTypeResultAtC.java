package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/8/14
 */
@Getter
@Setter
public class SysSignTypeResultAtC{

    private String type;

    private String value;

    private WechatCategory category;
    //标签组封面url
    private String stCoverUrl;

    private List<WechatSysSignResultAtC> wechatSysSigns;

    public SysSignTypeResultAtC(){}

}
