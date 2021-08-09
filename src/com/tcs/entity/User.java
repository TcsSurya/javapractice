package com.tcs.entity;

public class User {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMoblieNumber() {
		return moblieNumber;
	}
	public void setMoblieNumber(long moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	private long moblieNumber;
	private byte age;

}
