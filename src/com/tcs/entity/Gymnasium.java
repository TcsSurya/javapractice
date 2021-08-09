package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;


public class Gymnasium {
	static List<User> users = new ArrayList<User>();
	
	public static void main(String[] args) {
		createUsers();
	}
	
	private static void createUsers() {
		for(int i=0;i<10;i++) {
			User user = new User();
			user.setName("Ram"+i);
			user.setAge((byte)(10+i));
			users.add(user);
		}
		System.out.println(users);
		users.get(0).workout();
	}
}
