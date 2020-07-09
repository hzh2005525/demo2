package com.sogal.wx.core.dao.domain.mine;

import lombok.Data;

@Data
public class MyLatestSharer {

    private String source;

    //最近分享人ID
    private String target;

    private Integer nextNum;


    public MyLatestSharer(){

    }
    public MyLatestSharer(String source, String target) {
        this.source = source;
        this.target = target;
    }
}
