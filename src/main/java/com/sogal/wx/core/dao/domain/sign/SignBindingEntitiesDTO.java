package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/4/17.
 */
@Data
public class SignBindingEntitiesDTO extends BaseCondition{

    private String signId;
    private String title;

    public SignBindingEntitiesDTO(String signId, Integer pageStart, Integer pageSize){
        this.signId = signId;
        super.setPageSize(pageSize);
        super.setPageStart(pageStart);
    }

}
