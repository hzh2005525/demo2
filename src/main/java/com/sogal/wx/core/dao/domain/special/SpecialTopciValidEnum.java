package com.sogal.wx.core.dao.domain.special;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SpecialTopciValidEnum {

    INVALID("无效", 0),
    VALID("有效", 1);

    private String desc;
    private Integer code;

}
