package com.sogal.wx.core.dao.domain.mine;

import com.sogal.wx.core.dao.domain.enroll.EnrollStage;
import com.sogal.wx.core.dao.domain.user.InvalidReason;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by xiaoxuwang on 2019/4/25.
 */
@Data
public class MineCustomer  {

    private String id;
    private String userNo;
    private String name;
    private String mobile;
    private String nickname;
    private String avatarUrl;
    private String gender;
    private LocalDateTime timeCreated;
    private int clickTotal;
    private int numOfSameVisitor;
    /**
     * 是否有效
     */
    private Boolean valid;

    /**
     * 无效原因
     */
    private String invalidReason;

    /**
     * 阶段
     */
    private String stage;


    public void setInvalidReason(String invalidReason) {
        boolean belongInvalidReasonEnum = InvalidReason.belongInvalidReasonEnum(invalidReason);
        if(belongInvalidReasonEnum){
            InvalidReason invalidReasonEnum = Enum.valueOf(InvalidReason.class, invalidReason);
            this.invalidReason = invalidReasonEnum.getDesc();
        }else {
            this.invalidReason = invalidReason;
        }
    }

    public void setStage(String stage) {
        if(EnrollStage.INVALID.getCode().equals(stage)){
            this.valid = false;
        }else {
            this.valid = true;
        }

    }
}
