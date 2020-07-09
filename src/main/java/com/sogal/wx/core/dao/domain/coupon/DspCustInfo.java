package com.sogal.wx.core.dao.domain.coupon;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DspCustInfo {

    private String name;

    private String mobile;

    private String custId;

    public DspCustInfo(){

    }

    public DspCustInfo(String name, String mobile, String custId) {
        this.name = name;
        this.mobile = mobile;
        this.custId = custId;
    }

}
