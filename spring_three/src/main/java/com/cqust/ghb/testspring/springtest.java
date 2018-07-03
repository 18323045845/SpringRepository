package com.cqust.ghb.testspring;

import com.alibaba.fastjson.JSONObject;
import com.cqust.ghb.entity.Student;
import com.cqust.ghb.uservice.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
    //service的bean测试
    @Test
    public void test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us= (UserService) ctx.getBean("userService");
        System.out.println(us.getName()+us.getAge()+"----------");
    }
    //student的bean测试
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ctx.getBean("student");
        System.out.println(stu.getStu().getName());
        System.out.println(JSONObject.toJSONString(stu.getBookList()));
    }
}
