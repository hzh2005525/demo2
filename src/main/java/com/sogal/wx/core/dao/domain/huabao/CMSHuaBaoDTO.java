package com.sogal.wx.core.dao.domain.huabao;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.design.DesignShowLevel;
import com.sogal.wx.core.dao.domain.share.PreviewHuaBaoDTO;
import com.sogal.wx.core.dao.domain.share.PreviewImageDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CMSHuaBaoDTO extends CMSHuaBao {

    private PreviewHuaBaoDTO previewHuaBaoDTO;
}
