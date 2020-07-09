package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.enroll.EnrollStage;
import com.sogal.wx.core.dao.domain.mine.*;
import com.sogal.wx.core.dao.domain.user.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WechatUserRegisterMapper {

    void updateConvertStatus(@Param("id") String id, @Param("convertStatus") ConvertStatus convertStatus);

    void insertWechatUserRegister(UserEssentialInfoDTO userEssentialInfo);

    List<MyUserInfoSignUpedResult> findMyUserMpSignUpInfoAtAdmin(MyUserInfoSignUped queryCondition);

    int countMyUserMpSignUpInfoTotalSizeAtAdmin(MyUserInfoSignUped queryCondition);

    WechatUserFillBasicInfo findUserFillBaseInfoLast(WechatUserRegisterDTO queryUserFillInfoCondition);

    int findMyCustomerRegisterTotal(MyRecordDTO dto);

    int findMyVisitorRegisterTotal(MyRecordDTO dto);

    List<MineCustomer> findMyCustomerRegisters(MyRecordDTO dto);

    List<MineCustomer> findMyVisitorRegisters(MyRecordDTO dto);

    List<MyInfoSignUpedResultAtAdmin> findMySignUpInfo(@Param("userId") String userId);

    WechatUserRegister findUserRegisterById(@Param("id") String id);

    int markUserRegisterInvalid(WechatUserRegister wechatUserRegister);

    void updateEnrollStage(WechatUserRegister wechatUserRegister);

    int countUserEnrollInfoByUserId(@Param("userId") String userId);

    List<WechatUserRegister> selectMpUserRegistersBySharerNoAndStage(@Param("sharerNo") String sharerNo,
                                                                     @Param("stage") EnrollStage stage,
                                                                     @Param("date") String date);

    void batchMpInsertUserSignupBrand(List<UserSignupBrand> userSignupBrands);

    List<UserEssentialInfoDTO> findDspCustData72();

    List<UserSignupBrand> findUserSignupBrandByRegisterId(@Param("registerId") String registerId);
}
