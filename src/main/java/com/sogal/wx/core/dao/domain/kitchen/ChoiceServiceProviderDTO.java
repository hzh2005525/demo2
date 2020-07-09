package com.sogal.wx.core.dao.domain.kitchen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ChoiceServiceProviderDTO {

    private String id;

    /**
     *服务商ID
     */
    private String serviceProviderId;

    /**
     * 计划上门时机
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date planServiceTime;


    /**
     * 选择服务商时填写备注
     */
    private String assignProviderRemark;



}
