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
 * 目标任务表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-19
 */
@Getter
@Setter
@TableName("task")
public class Task {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 目标类型
     */
    @TableField("category_code")
    private Integer categoryCode;

    /**
     * 目标属性
     */
    @TableField("type_id")
    private Long typeId;

    /**
     * 目标内容
     */
    @TableField("content")
    private String content;

    /**
     * 到期时间
     */
    @TableField("expire_time")
    private LocalDateTime expireTime;

    /**
     * 扩展信息
     */
    @TableField("extend_info")
    private String extendInfo;

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
