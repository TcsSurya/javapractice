package com.tcs.entity;

public class StaticDemo {
	Bank bank = new Bank();
//	Bank.createNewAccountNumber();
}

class Bank{
	static int counter;
	public static int createNewAccountNumber(){
		return ++counter;
	}
}
