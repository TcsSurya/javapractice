package com.tcs.set.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		treeSetDemo();
//		Set<User> users = createSet();
//		System.out.println(users);
	}

	private static Set<User> treeSetDemo() {
		Set<User> users = new TreeSet<User>();
		for(int i =0;i < 30;i++) {
			User user = new User();
			user.setAge(10+i);
			users.add(user);
		}
		return users;
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
