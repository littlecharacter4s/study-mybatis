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
 * @since 2022-06-03
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
     * 员工id
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
     * 员工所在任务职能
     */
    @TableField("function_code")
    private Integer functionCode;

    /**
     * 任务步骤
     */
    @TableField("flow_code")
    private Integer flowCode;

    /**
     * 流程顺序
     */
    @TableField("flow_order")
    private Integer flowOrder;

    /**
     * 状态（0-初始化，1-待完成，2-已完成，3-已作废）
     */
    @TableField("status")
    private Integer status;

    /**
     * 文件地址
     */
    @TableField("file_url")
    private String fileUrl;

    /**
     * 节点内容信息
     */
    @TableField("content")
    private String content;

    /**
     * 操作者
     */
    @TableField("operator_id")
    private Long operatorId;

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
