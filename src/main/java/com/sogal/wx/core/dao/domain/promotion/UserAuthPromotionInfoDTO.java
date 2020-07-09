package com.sogal.wx.core.dao.domain.promotion;

import lombok.Data;

@Data
public class UserAuthPromotionInfoDTO extends UserAuthPromotion {

    /**
     * 经销商ID
     */
    private String repoId;

    /**
     * 推广大使类别
     */
    private String emissaryType;



}
