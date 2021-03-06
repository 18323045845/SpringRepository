package com.cqust.ghb.Logger4j;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

public class ServiceLogger {
	private Logger logger=Logger.getLogger(this.getClass());

	//定义一个切点供大家调用
	@Pointcut("execution(* com.cqust.ghb..*.*(..))")
	public void point(){}
	//创建logger对象
	//前置增强
	@Before("point()")
	public void before(JoinPoint jp) {
		logger.info("调用了" + jp.getTarget() + "里面的"
				+ jp.getSignature().getName() + "参数为："
				+ Arrays.toString(jp.getArgs()));
	}

	
	//后置增强,该方法抛出异常后就不增强了
	@AfterReturning("point()")
	public void afterReturing(JoinPoint jp, Object result) {
		logger.info("调用了" + jp.getTarget() + "里面的"
				+ jp.getSignature().getName() + "参数为："
				+ Arrays.toString(jp.getArgs())+",返回值为："+result);
	}

	@After("point()")
	//最终增强，无论是方法正常退出还是执行都会有的增强
	public void after(JoinPoint jp){
		System.out.println(jp.getSignature().getName()+"方法执行结束");
	}

	@Around("point()")
	//环绕增强，是功能最强大的增强，目标方法的控制权都交给了它，可以在前后进行织入增强
	public Object aroundLogger(ProceedingJoinPoint jp)throws Throwable {
		System.out.println("环绕增强：方法执行前-----------");
		//获取目标方法的参数
		Object[] args = jp.getArgs();
		Object result = jp.proceed(args);//执行目标方法
		
		System.out.println("目标方法的返回值为："+result);
		System.out.println("环绕增强：方法执行后-----------");
		
		return result;
	}
	
}
