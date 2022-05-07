package com.lc.mybatis.plus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 员工组织关系表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-07
 */
@Getter
@Setter
@TableName("staff_org")
public class StaffOrg {

    /**
     * 员工id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工id
     */
    @TableField("staff_id")
    private Long staffId;

    /**
     * 组织id
     */
    @TableField("org_id")
    private String orgId;

    /**
     * 状态（0，在职，1离岗）
     */
    @TableField("status")
    private Integer status;

    /**
     * 起始时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 截止时间
     */
    @TableField("end_time")
    private LocalDateTime endTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
