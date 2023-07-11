package com.xworkz.inheritance.things;

public class LinkedIn extends Application{
	public String userName;
	public String password;
	public int users;
	
	public LinkedIn() {
		System.out.println("LinkedIn no-arguments constructor");
	}

	public LinkedIn(String userName, String password, int users) {
		this.userName = userName;
		this.password = password;
		this.users = users;
	}
	
	public void follow() {
		System.out.println("LinkedIn follow method");
	}
	

}
