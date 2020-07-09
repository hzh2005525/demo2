package com.sogal.wx.core.dao.domain.kitchen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddServiceAppointAtAdminDTO extends AddServiceAppointDTO{

    /**
     * 预约时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date appointTime;

    /**
     * 服务商id
     */
    private String serviceProviderId;

}
