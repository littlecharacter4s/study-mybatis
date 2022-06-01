package com.lc.mybatis.plus.service.impl;

import com.lc.mybatis.plus.domain.Notice;
import com.lc.mybatis.plus.mapper.NoticeMapper;
import com.lc.mybatis.plus.service.NoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知公告表 服务实现类
 * </p>
 *
 * @author gujixian
 * @since 2022-05-31
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

}
