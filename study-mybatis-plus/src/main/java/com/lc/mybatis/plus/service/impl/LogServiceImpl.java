package com.lc.mybatis.plus.service.impl;

import com.lc.mybatis.plus.domain.Log;
import com.lc.mybatis.plus.mapper.LogMapper;
import com.lc.mybatis.plus.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作记录表 服务实现类
 * </p>
 *
 * @author gujixian
 * @since 2022-05-05
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
