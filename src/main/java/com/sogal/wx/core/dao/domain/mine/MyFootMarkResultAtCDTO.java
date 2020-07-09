package com.sogal.wx.core.dao.domain.mine;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MyFootMarkResultAtCDTO {


    private String designId;


    private String title;

    private String panorama;

    private Boolean formaled;

    private String imageUrl;

    private String reduceUrl;

    private Date timeCreated;


    public MyFootMarkResultAtCDTO(){

    }
}
