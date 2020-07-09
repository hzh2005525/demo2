package com.sogal.wx.core.dao.domain.special;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PublishStatusEnum {

    NOPUBLISH("未发布", 0),
    PUBLISHED("已发布", 1);

    private String desc;
    private Integer code;

}
