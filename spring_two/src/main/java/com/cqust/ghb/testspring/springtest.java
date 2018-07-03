package com.cqust.ghb.testspring;


import com.cqust.ghb.jkimp.Printter;
import com.cqust.ghb.jkimp.Student;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
    //测试stu的bean
    @Test
    public void test1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ctx.getBean("dh");
        Student stu01= (Student) ctx.getBean("ghb");
        stu.say();
        stu01.say();
    }

    //测试打印机的bean
    @Test
    public void test2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Printter printter = (Printter) ctx.getBean("print");
        printter.print();
    }
}
