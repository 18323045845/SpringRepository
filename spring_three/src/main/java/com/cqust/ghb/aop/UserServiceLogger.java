package com.cqust.ghb.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class UserServiceLogger {
	
	private Logger logger =Logger.getLogger(this.getClass());
	
	//创建logger对象
	public void before(JoinPoint jp) {
		logger.info("调用了" + jp.getTarget() + "里面的"
				+ jp.getSignature().getName() + "参数为："
				+ Arrays.toString(jp.getArgs()));
	}

	public void after(JoinPoint jp, Object result) {
		logger.info("调用了" + jp.getTarget() + "里面的"
				+ jp.getSignature().getName() + "参数为："
				+ Arrays.toString(jp.getArgs())+",返回值为："+result);
	}
}
