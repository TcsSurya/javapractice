package com.tcs.set.example;

import java.lang.Comparable;

public class User implements Comparable {
	private String name;
	private int age;
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
	
//	@Override
	public int compareTo(User user) {
		// TODO Auto-generated method stub
		return user.getAge()-this.getAge();
	}
	
	@Override
	public String toString() {
		return Integer.toString(age);
	}
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
}
