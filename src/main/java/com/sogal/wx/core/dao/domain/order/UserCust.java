package com.sogal.wx.core.dao.domain.order;

import com.sogal.common.util.StringUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCust {
    private String id;
    private String userId;
    private String custId;
    private String unionId;

    public UserCust(){
        this.id = StringUtil.uuid();
    }
}
