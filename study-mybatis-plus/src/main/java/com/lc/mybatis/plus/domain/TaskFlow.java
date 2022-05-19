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
 * @since 2022-05-16
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
     * 顺序
     */
    @TableField("order")
    private Integer order;

    /**
     * 状态（0-初始化，1，已完成）
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
