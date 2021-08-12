package com.tcs.set.example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<User> users = createSet();
		System.out.println(users);
	}

	private static Set<User> createSet() {
		Set<User> users = new HashSet<User>();
		for(int i=0;i<20;i++) {
			User user = new User();
			user.setAge(10+i);
			users.add(user);
		}
		return users;
		
		// TODO Auto-generated method stub
		
	}

}
