package com.lc.mybatis.plus.mapper;

import com.lc.mybatis.plus.domain.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 操作记录表 Mapper 接口
 * </p>
 *
 * @author gujixian
 * @since 2022-05-05
 */
@Mapper
public interface LogMapper extends BaseMapper<Log> {

}
