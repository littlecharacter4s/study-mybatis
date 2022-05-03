package com.lc.mybatis.plus;

import com.alibaba.fastjson.JSON;
import com.lc.mybatis.plus.domain.Log;
import com.lc.mybatis.plus.mapper.LogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class MyBatisPlusTest {
    @Resource
    private LogMapper logMapper;

    @Test
    public void testGetLogs() {
        // System.out.println("HelloWorld");
        List<Log> logs = logMapper.selectList(null);
        System.out.println(JSON.toJSONString(logs));
    }
}