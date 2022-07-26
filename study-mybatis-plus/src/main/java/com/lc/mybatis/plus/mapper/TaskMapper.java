package com.lc.mybatis.plus.mapper;

import com.lc.mybatis.plus.domain.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 目标任务表 Mapper 接口
 * </p>
 *
 * @author gujixian
 * @since 2022-07-25
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

}
