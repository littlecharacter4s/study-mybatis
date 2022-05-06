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
 * 操作记录表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-06
 */
@Getter
@Setter
@TableName("log")
public class Log {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 操作行为
     */
    @TableField("action")
    private String action;

    /**
     * 操作信息
     */
    @TableField("message")
    private String message;

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


}
