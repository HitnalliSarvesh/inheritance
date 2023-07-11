package com.xworkz.inheritance.things;

public class Telegram extends Application{
	public String phoneNumber;
	public int friends;
	public String userName;
	
	public Telegram() {
		System.out.println("telegram no-argument constructor");
	}

	public Telegram(String phoneNumber, int friends, String userName) {
		this.phoneNumber = phoneNumber;
		this.friends = friends;
		this.userName = userName;
	}

	public void download() {
		System.out.println("Telegram download method");
	}
	

}
