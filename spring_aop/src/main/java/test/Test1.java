package test;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;


public class Test1 {
	@Test
	public void test1() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us=(UserService) ctx.getBean("userServiceimp");
		us.addone();
	}
	


}
