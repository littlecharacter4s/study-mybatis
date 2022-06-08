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
 * 员工消息表
 * </p>
 *
 * @author gujixian
 * @since 2022-06-08
 */
@Getter
@Setter
@TableName("staff_msg")
public class StaffMsg {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工id
     */
    @TableField("staff_id")
    private Long staffId;

    /**
     * 目标任务id
     */
    @TableField("task_id")
    private Long taskId;

    /**
     * 消息内容
     */
    @TableField("message")
    private String message;

    /**
     * 推送状态：1-已推送，2-已读取
     */
    @TableField("msg_status")
    private Integer msgStatus;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

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
