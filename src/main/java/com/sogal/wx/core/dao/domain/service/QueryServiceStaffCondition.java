package com.sogal.wx.core.dao.domain.service;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class QueryServiceStaffCondition {

    private String name;

    private String mobile;

    private String status;

    private String providerIdInclude;

    private String providerIdExcluding;

}
