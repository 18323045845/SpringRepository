package com.cqust.ghb.entity;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private int age;
	private Class stu;
	private List<String> bookList;
	private Set<String> moneySet; 
	private Map<String,String> healthMap;
	private Properties ohter;
	
	public List<String> getBookList() {
		return bookList;
	}
	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}
	public Set<String> getMoneySet() {
		return moneySet;
	}
	public void setMoneySet(Set<String> moneySet) {
		this.moneySet = moneySet;
	}
	public Map<String, String> getHealthMap() {
		return healthMap;
	}
	public void setHealthMap(Map<String, String> healthMap) {
		this.healthMap = healthMap;
	}
	public Properties getOhter() {
		return ohter;
	}
	public void setOhter(Properties ohter) {
		this.ohter = ohter;
	}
	
	
	public Class getStu() {
		return stu;
	}
	public void setStu(Class stu) {
		this.stu = stu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	
}
