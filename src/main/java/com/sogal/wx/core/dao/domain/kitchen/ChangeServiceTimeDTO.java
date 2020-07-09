package com.sogal.wx.core.dao.domain.kitchen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ChangeServiceTimeDTO {

    private String id;

    /**
     * 计划上门时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date planServiceTime;


    private String changeServiceTimeReason;


}
