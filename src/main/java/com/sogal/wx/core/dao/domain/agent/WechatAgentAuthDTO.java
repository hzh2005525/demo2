package com.sogal.wx.core.dao.domain.agent;

import com.sogal.wx.core.dao.domain.user.WechatUser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WechatAgentAuthDTO extends WechatAgentAuth {

    private List<WechatUser> list = new ArrayList<>();

    @ApiModelProperty("关注服务号")
    private List<String> follow;

}
