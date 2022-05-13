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
 * 目标任务流程表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-13
 */
@Getter
@Setter
@TableName("task_flow")
public class TaskFlow {

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
     * 操作人id
     */
    @TableField("operator_id")
    private Long operatorId;

    /**
     * 职能
     */
    @TableField("function_code")
    private Integer functionCode;

    /**
     * 职能
     */
    @TableField("flow_code")
    private Integer flowCode;

    /**
     * 状态
     */
    @TableField("status")
    private Integer status;

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
