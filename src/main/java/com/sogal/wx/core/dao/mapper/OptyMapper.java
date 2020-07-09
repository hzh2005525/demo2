package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.customer.CustMemberRole;
import com.sogal.common.domain.customer.Customer;
import com.sogal.common.domain.customer.CustomerMember;
import com.sogal.common.domain.dealer.EmployeeDTO;
import com.sogal.common.domain.sales.Dynamic;
import com.sogal.common.domain.sales.House;
import com.sogal.common.domain.sales.Opportunity;
import com.sogal.common.domain.task.Task;
import com.sogal.wx.core.dao.domain.user.OptySource;
import com.sogal.wx.core.dao.domain.user.UserEssentialInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OptyMapper {
    List<UserEssentialInfoDTO> findUserSignUpDataByIds(@Param("ids") List<String> ids);

    EmployeeDTO findEmpAndPrimaryOrgByMobile(@Param("mobile") String sharerMobile,
                                             @Param("dealerCode") String dealerCode);

    EmployeeDTO findEmpAndPrimaryOrgByEmpIdAndDealerCode(@Param("empId") String empId,
                                                         @Param("dealerCode") String dealerCode);

    void batchInsertOptySource(List<OptySource> optySources);

    Customer findCustInfoByMobile(@Param("mobile") String mobile);

    List<Opportunity> findOptysByCustomerId(@Param("customerId") String customerId);

    List<OptySource> findOptySourceByOptyId(@Param("optyIds") List<String> optyIds);

    void updateCustInfoById(@Param("c") Customer customer);

    void updateCustHouseById(@Param("h") House house);

    void updateOptyById(@Param("opportunity") Opportunity opportunity);

    List<Task> findTaskByOptyId(@Param("opportunityId") String opportunityId);

    void updateTaskById(Task task);

    List<Dynamic> findByKeyWord(@Param("customerId") String id);

    void updateDynamic(Dynamic dynamic);

    List<CustomerMember> findByCustomerId(@Param("customerId") String customerId,
                                          @Param("role") CustMemberRole role);

    void updateCustMemberById(CustomerMember customerMember);
}
