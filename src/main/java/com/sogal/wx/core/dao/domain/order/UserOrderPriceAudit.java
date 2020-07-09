package com.sogal.wx.core.dao.domain.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserOrderPriceAudit {

    private BigDecimal auditActualAmount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date timeCreated;

}
