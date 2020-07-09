package com.sogal.wx.core.dao.domain.mine;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class MyCollectionResultAtAdmin {
    /**
     * 业务类别
     */
    private String realm;

    /**
     *业务id
     */
    private String realmId;

    /**
     * 内容
     */
    private String realmContent;

    /**
     * 收藏时间
     */
    private Date timeCreated;
}
