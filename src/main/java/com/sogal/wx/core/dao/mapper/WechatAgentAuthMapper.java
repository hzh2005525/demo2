package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.agent.AgentAuthQueryCondition;
import com.sogal.wx.core.dao.domain.agent.WechatAgentAuth;
import com.sogal.wx.core.dao.domain.agent.WechatAgentAuthDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatAgentAuthMapper {

    List<WechatAgentAuthDTO> staffList(@Param("agentAuthQueryCondition") AgentAuthQueryCondition agentAuthQueryCondition,
                                       @Param("pageInfo") PageInfo pageInfo);

    int staffCount(@Param("agentAuthQueryCondition") AgentAuthQueryCondition agentAuthQueryCondition);

    List<WechatAgentAuthDTO> cooperatorList(@Param("agentAuthQueryCondition") AgentAuthQueryCondition agentAuthQueryCondition,
                                            @Param("pageInfo") PageInfo pageInfo);

    int cooperatorCount(@Param("agentAuthQueryCondition") AgentAuthQueryCondition agentAuthQueryCondition);

    List<WechatAgentAuthDTO> otherList(@Param("agentAuthQueryCondition") AgentAuthQueryCondition agentAuthQueryCondition,
                                       @Param("pageInfo") PageInfo pageInfo);

    int otherCount(@Param("agentAuthQueryCondition") AgentAuthQueryCondition agentAuthQueryCondition);

    int insertStaffSelective(WechatAgentAuth wechatAgentAuth);

    int insertCooperatorSelective(WechatAgentAuth wechatAgentAuth);

    int insertOtherSelective(WechatAgentAuth wechatAgentAuth);

    void insertStaffBatch(@Param("list") List<WechatAgentAuth> list);

    void insertCooperatorBatch(@Param("list") List<WechatAgentAuth> list);

    void insertOtherBatch(@Param("list") List<WechatAgentAuth> list);

    int updateStaffBySelective(WechatAgentAuth wechatAgentAuth);

    int updateCooperatorBySelective(WechatAgentAuth wechatAgentAuth);

    int updateOtherBySelective(WechatAgentAuth wechatAgentAuth);

    int deleteStaffById(@Param("id") String id);

    int deleteCooperatorById(@Param("id") String id);

    int deleteOtherById(@Param("id") String id);

    WechatAgentAuth selectStaffByMobileAndAgent(@Param("mobile") String mobile, @Param("agent") String agent);

    WechatAgentAuth selectCooperatorByMobileAndAgent(@Param("mobile") String mobile, @Param("agent") String agent);

    WechatAgentAuth selectOtherByMobile(@Param("mobile") String mobile);

    WechatAgentAuth selectStaffById(@Param("id") String id);

    WechatAgentAuth selectCooperatorById(@Param("id") String id);

    WechatAgentAuth selectOtherById(@Param("id") String id);

    List<String> getGzhImageUrl(@Param("list") List<String> list);

    int batchIncreSyncEmployees(@Param("list") List<WechatAgentAuth> list);

    int batchIncreSyncCooperators(@Param("list") List<WechatAgentAuth> list);

    WechatAgentAuth findStaffsByMobile(@Param("mobile") String mobile);

    WechatAgentAuth findCooperatorsByMobile(@Param("mobile") String mobile);

    WechatAgentAuth findOthersByMobile(@Param("mobile") String mobile);

    int addOtherBySelective(WechatAgentAuth wechatAgentAuth);

    List<String> selectCancelBaseStaffAuthMobiles();

    List<String> selectCancelBaseCooperatorAuthMobiles();

}
