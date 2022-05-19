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
 * 人员目标任务表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-17
 */
@Getter
@Setter
@TableName("staff_task")
public class StaffTask {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 目标id
     */
    @TableField("task_id")
    private Long taskId;

    /**
     * 人员id
     */
    @TableField("staff_id")
    private Long staffId;

    /**
     * 人员名称
     */
    @TableField("staff_name")
    private String staffName;

    /**
     * 组织id
     */
    @TableField("org_id")
    private Long orgId;

    /**
     * 组织名称
     */
    @TableField("org_name")
    private String orgName;

    /**
     * 职能
     */
    @TableField("function_code")
    private Integer functionCode;

    /**
     * 是否有效：0-无效，1-有效
     */
    @TableField("valid")
    private Integer valid;

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

    /**
     * 是否在相关人列表展示
     */
    @TableField("is_show")
    private Integer isShow;


}
