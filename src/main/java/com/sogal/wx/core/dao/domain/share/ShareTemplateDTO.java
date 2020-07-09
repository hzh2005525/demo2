package com.sogal.wx.core.dao.domain.share;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShareTemplateDTO extends ShareTemplate {

    @ApiModelProperty("引用数量")
    private int quoteNum;
    private PreviewImageDTO previewImage;

}
