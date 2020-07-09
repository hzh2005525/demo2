package com.sogal.wx.core.dao.domain.kitchen;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpServiceAppointNonWorkingDay extends BaseEntity{

    /**
     * 类型
     */
    private String type;

    /**
     * 不可预约日期
     */
    private Date nonWorkingDate;
}
