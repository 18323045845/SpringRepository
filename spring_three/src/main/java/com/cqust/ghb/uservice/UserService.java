package com.cqust.ghb.uservice;


import com.cqust.ghb.dao.UserDao;

public class UserService {
	private UserDao dao;
	private String name;
	private int age;
	
	public UserService(UserDao dao ,String name,int age) {
		this.dao=dao;
		this.name=name;
		this.age=age;
	}
//	public UserService() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public UserDao getDao() {
		return dao;
	}
}
