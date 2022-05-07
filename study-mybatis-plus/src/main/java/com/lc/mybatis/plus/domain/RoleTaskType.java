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
 * 角色任务类型关系表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-07
 */
@Getter
@Setter
@TableName("role_task_type")
public class RoleTaskType {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色id
     */
    @TableField("role_id")
    private Long roleId;

    /**
     * 任务类型id
     */
    @TableField("task_type_id")
    private Long taskTypeId;

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
