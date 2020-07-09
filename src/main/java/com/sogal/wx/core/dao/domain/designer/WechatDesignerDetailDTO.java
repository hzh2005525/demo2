package com.sogal.wx.core.dao.domain.designer;

import com.sogal.wx.core.dao.domain.user.WechatUser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zhaojie
 * @Description :
 * @Date : 2019/7/17
 */
@Getter
@Setter
public class WechatDesignerDetailDTO extends WechatDesigner {

    private String mobile;

    @ApiModelProperty("关注服务号")
    private List<String> follow;

    private List<WechatUser> list = new ArrayList();

}
