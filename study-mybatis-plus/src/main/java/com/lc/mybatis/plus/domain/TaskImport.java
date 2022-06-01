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
 * 目标导入记录表
 * </p>
 *
 * @author gujixian
 * @since 2022-06-02
 */
@Getter
@Setter
@TableName("task_import")
public class TaskImport {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文件地址
     */
    @TableField("file_url")
    private String fileUrl;

    /**
     * 导入目标数量
     */
    @TableField("task_count")
    private Integer taskCount;

    /**
     * 导入成功数量
     */
    @TableField("success_count")
    private Integer successCount;

    /**
     * 导入失败数量
     */
    @TableField("failure_count")
    private Integer failureCount;

    /**
     * 导入结果（0-导入中，1-导入成功，2-导入失败）
     */
    @TableField("result")
    private Integer result;

    /**
     * 创建人id
     */
    @TableField("creator_id")
    private Long creatorId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;


}
