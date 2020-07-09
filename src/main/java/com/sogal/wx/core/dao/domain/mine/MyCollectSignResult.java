package com.sogal.wx.core.dao.domain.mine;

import lombok.Data;

import java.util.List;

@Data
public class MyCollectSignResult  {
    private String userId;
    private List<String> designIds;
    private String realm;

    //标签id
    private String signId;

    //标签code
    private String code;

    //标签中文值
    private String value;

    //标签图标路径
    private String iconUrl;

    //引用当前标签的设计方案数
    private int quoteNum;

}
