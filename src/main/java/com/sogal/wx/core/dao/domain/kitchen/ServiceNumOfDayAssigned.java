package com.sogal.wx.core.dao.domain.kitchen;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ServiceNumOfDayAssigned {

    private String appointDate;

    private int num;

    private String worked = "Y";
}
