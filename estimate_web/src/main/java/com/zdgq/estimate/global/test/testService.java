package com.zdgq.estimate.global.test;

import com.zdgq.estimate.service.AdminsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-service.xml")
public class testService {

    @Autowired
    private AdminsService adminsService;

    @Test
    public void testMethod(){
        adminsService.findAll();
    }
}
