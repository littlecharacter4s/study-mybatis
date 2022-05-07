package com.lc.mybatis.plus.controller;

import com.lc.mybatis.plus.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class LogControllerTest {
    @Resource
    private LogController logController;

    // @Test
    public void testLog() {
        // logController.log();
    }
}