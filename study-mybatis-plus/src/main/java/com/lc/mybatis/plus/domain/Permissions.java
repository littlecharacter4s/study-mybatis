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
 * 权限信息表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-16
 */
@Getter
@Setter
@TableName("permissions")
public class Permissions {

    /**
     * 权限点id
     */
    @TableId(value = "perm_id", type = IdType.AUTO)
    private Long permId;

    /**
     * 权限点名称
     */
    @TableField("name")
    private String name;

    /**
     * 权限点url
     */
    @TableField("url")
    private String url;

    /**
     * 权限点标识
     */
    @TableField("tag")
    private String tag;

    /**
     * 状态（0有效，1无效）
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
