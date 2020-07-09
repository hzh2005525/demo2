package com.sogal.wx.core.dao.domain.kitchen;

import com.sogal.wx.core.dao.domain.image.WechatImage;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EvaluateCommitServiceDTO {

    private String id;

    private int evaluateScore;

    private String evaluateContent;

    private List<WechatImage> images;


}
