package com.sogal.wx.core.dao.domain.kitchen;

import com.sogal.wx.core.dao.domain.image.WechatImage;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FinishCommitServiceDTO {

    private String id;

    private List<WechatImage> images;

    private String staffId;
}
