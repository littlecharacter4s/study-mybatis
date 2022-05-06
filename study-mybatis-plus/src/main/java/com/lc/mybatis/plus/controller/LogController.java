package com.lc.mybatis.plus.controller;
import java.time.LocalDateTime;


import com.lc.mybatis.plus.domain.Log;
import com.lc.mybatis.plus.service.LogService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 操作记录表 前端控制器
 * </p>
 *
 * @author gujixian
 * @since 2022-05-05
 */
@RestController
@RequestMapping
public class LogController {
    @Resource
    private LogService logService;

    @RequestMapping("/log")
    public String log() {
        List<Log> logList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Log log = new Log();
            log.setId(i + 1L);
            log.setAction(i + "");
            log.setMessage(i + "");
            log.setOperatorId(i + 1L);
            log.setCreateTime(LocalDateTime.now());
            logList.add(log);
        }
        logService.saveOrUpdateBatch(logList, 5);
        return "batch save log success";
    }
}
