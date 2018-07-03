package com.cqust.ghb.jkimp;

public class Student {
	private  String name;
	private  String context;
	


	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println(name+"说"+context);
	}
}
