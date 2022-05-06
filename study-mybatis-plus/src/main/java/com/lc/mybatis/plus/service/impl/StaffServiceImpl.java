package com.lc.mybatis.plus.service.impl;

import com.lc.mybatis.plus.domain.Staff;
import com.lc.mybatis.plus.mapper.StaffMapper;
import com.lc.mybatis.plus.service.StaffService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author gujixian
 * @since 2022-05-06
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService {

}
