package com.cqust.ghb.testclass;

import com.cqust.ghb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testWay(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us= (UserService) ctx.getBean("userService");
        us.getList();
    }
}
