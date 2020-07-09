package com.sogal.wx.core.dao.domain.service;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddASProviderDTO extends MpServiceProvider{

   private String staffName;

   private String staffMobile;

   private String positionId;
}
