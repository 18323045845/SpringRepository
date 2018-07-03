package dao;

import org.apache.log4j.Logger;


public class UserDaoimp implements UserDao{
	private Logger logger=Logger.getLogger(this.getClass());

	@Override
	public void add() {
		logger.info("1");
		System.out.println("添加一个");
	}

	@Override
	public void query() {
		logger.info("2");
		System.out.println("查询一个");
	}
}
