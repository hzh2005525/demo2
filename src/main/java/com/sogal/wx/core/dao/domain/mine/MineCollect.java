package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.design.WechatDesign;
import lombok.Data;

@Data
public class MineCollect extends WechatDesign{

    private String coverUrl;

    private String coverReduceUrl;

    private String contentSyllabus;

    private int imageNum;

}
