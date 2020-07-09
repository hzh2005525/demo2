package com.sogal.wx.core.dao.domain.coupon;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DspCustOrderInfo extends DspCustInfo{

    private String orderNo;

    private String city;

    private String area;

    private String addr;

    private String houseNumber;

    private String houseId;

}
