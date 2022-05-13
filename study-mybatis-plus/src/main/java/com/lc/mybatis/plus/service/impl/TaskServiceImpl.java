package com.lc.mybatis.plus.service.impl;

import com.lc.mybatis.plus.domain.Task;
import com.lc.mybatis.plus.mapper.TaskMapper;
import com.lc.mybatis.plus.service.TaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 目标任务表 服务实现类
 * </p>
 *
 * @author gujixian
 * @since 2022-05-13
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService {

}
