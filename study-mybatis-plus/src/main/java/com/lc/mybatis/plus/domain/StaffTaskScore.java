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
 * 人员目标记分表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-13
 */
@Getter
@Setter
@TableName("staff_task_score")
public class StaffTaskScore {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 任务Id
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
     * 目标评判
     */
    @TableField("task_evaluation")
    private Integer taskEvaluation;

    /**
     * 得分
     */
    @TableField("score")
    private Integer score;

    /**
     * 得分说明
     */
    @TableField("score_note")
    private String scoreNote;

    /**
     * 创建人id
     */
    @TableField("creator_id")
    private Long creatorId;

    /**
     * 操作人id
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
