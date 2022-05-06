package com.lc.mybatis.plus.mapper;

import com.lc.mybatis.plus.domain.Staff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息表 Mapper 接口
 * </p>
 *
 * @author gujixian
 * @since 2022-05-06
 */
@Mapper
public interface StaffMapper extends BaseMapper<Staff> {

}
