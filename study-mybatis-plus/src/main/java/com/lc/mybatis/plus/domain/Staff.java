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
 * 员工信息表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-13
 */
@Getter
@Setter
@TableName("staff")
public class Staff {

    /**
     * 员工id
     */
    @TableId(value = "staff_id", type = IdType.AUTO)
    private Long staffId;

    /**
     * 账号
     */
    @TableField("account")
    private String account;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 人员状态（0-无效，1-有效）
     */
    @TableField("status")
    private Integer status;

    /**
     * 登录状态（0-禁止，1-允许）
     */
    @TableField("system_status")
    private Integer systemStatus;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 数据权限（查看组织）
     */
    @TableField("org_ids")
    private String orgIds;

    /**
     * 归属组织
     */
    @TableField("org_id")
    private Long orgId;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * e-mail
     */
    @TableField("email")
    private String email;

    /**
     * 员工编号
     */
    @TableField("empno")
    private String empno;

    /**
     * 员工职位
     */
    @TableField("post_code")
    private Integer postCode;

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
