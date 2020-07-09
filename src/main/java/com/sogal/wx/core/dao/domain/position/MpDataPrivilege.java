package com.sogal.wx.core.dao.domain.position;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MpDataPrivilege {


    //职位id
    private String positionId;

    /**
     * 服务类型
     */
    private String serviceType;


    private String dataPrivilege;


}
