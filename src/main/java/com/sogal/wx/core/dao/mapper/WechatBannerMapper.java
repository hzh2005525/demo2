package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.banner.BannerSearchCondition;
import com.sogal.wx.core.dao.domain.banner.BannerSearchResult;
import com.sogal.wx.core.dao.domain.banner.UpdateBannerDTO;
import com.sogal.wx.core.dao.domain.banner.WechatBanner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface WechatBannerMapper {

    int addBanner(WechatBanner wechatBanner);

    List<BannerSearchResult> findBanners(BannerSearchCondition condition);

    int findBannersCount(BannerSearchCondition condition);

    int deleteBanner(@Param("updator")String updator, @Param("id")String id);

    List<BannerSearchResult> findBrannerInfoByGroup(BannerSearchCondition condition);

    void addBanners(List<WechatBanner> wechatBanners);

    void updateBannerById(UpdateBannerDTO banner);

    WechatBanner findBannerById(String id);

    void adjustBannerOrder(WechatBanner banner);
}
