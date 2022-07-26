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
 * @since 2022-07-26
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
     * 源任务id
     */
    @TableField("pid")
    private Long pid;

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
     * 创建人姓名
     */
    @TableField("creator_name")
    private String creatorName;

    /**
     * 创建部门id
     */
    @TableField("creator_org_id")
    private Long creatorOrgId;

    /**
     * 创建部门名称
     */
    @TableField("creator_org_name")
    private String creatorOrgName;

    /**
     * 执行部门id
     */
    @TableField("ceo_org_id")
    private Long ceoOrgId;

    /**
     * 执行部门名称
     */
    @TableField("ceo_org_name")
    private String ceoOrgName;

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

    /**
     * 任务状态（0：处理中，2：已完成）
     */
    @TableField("status")
    private Integer status;

    /**
     * 文件地址
     */
    @TableField("file_url")
    private String fileUrl;


}
