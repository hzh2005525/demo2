package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.image.WechatImage;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/4/16.
 */
@Data
public class SignUpdateDTO {

    private SignImageOperator iconOperator;
    private WechatImage iconImage;
    private String icon;
    private SignImageOperator coverOperator;
    private WechatImage coverImage;
    private String cover;

    private String value;
    private String desc;
    private String updator;
    private String id;

    public SignUpdateDTO(String id, String updator){
        this.id = id;
        this.updator = updator;
    }


}
