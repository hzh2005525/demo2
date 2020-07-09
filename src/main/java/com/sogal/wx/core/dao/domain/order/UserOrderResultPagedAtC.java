package com.sogal.wx.core.dao.domain.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sogal.common.domain.appletc.UserCustOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserOrderResultPagedAtC extends UserCustOrder{

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date contractDeliveryDate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private  Date planDeliveryDate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private  Date planInstallDate;

}
