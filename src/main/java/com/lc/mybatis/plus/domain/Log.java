package com.lc.mybatis.plus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 操作记录表
 * </p>
 *
 * @author gujixian
 * @since 2022-05-05
 */
@Getter
@Setter
@TableName("log")
@ApiModel(value = "Log对象", description = "操作记录表")
public class Log {

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("操作行为")
    @TableField("action")
    private String action;

    @ApiModelProperty("操作信息")
    @TableField("message")
    private String message;

    @ApiModelProperty("操作人id")
    @TableField("operator_id")
    private Long operatorId;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


}
