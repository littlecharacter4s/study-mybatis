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
 * 角色信息表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-07
 */
@Getter
@Setter
@TableName("role")
public class Role {

    /**
     * 角色id
     */
    @TableId(value = "role_id", type = IdType.AUTO)
    private Long roleId;

    /**
     * 角色名称
     */
    @TableField("name")
    private String name;

    /**
     * 英文名称
     */
    @TableField("english_name")
    private String englishName;

    /**
     * 状态（0-无效，1-有效）
     */
    @TableField("status")
    private Integer status;

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
