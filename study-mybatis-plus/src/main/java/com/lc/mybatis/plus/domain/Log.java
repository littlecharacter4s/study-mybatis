package com.lc.mybatis.plus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    private Long id;
    private String action;
    private String message;
    private Long operatorId;
    private Date createTime;
}