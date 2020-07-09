package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import lombok.Data;

import java.util.List;

@Data
public class MyCollectSignDTO extends BaseCondition {
    private String userId;
    private List<String> designIds;
    private String realm;
}
