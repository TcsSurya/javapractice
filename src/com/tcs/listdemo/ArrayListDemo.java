package com.tcs.listdemo;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
//		shortList(numbers);
		filterList(numbers);
		System.out.println("after sorging="+numbers);
	}
	//method to filter elements
	private static void filterList(List<Integer> numbers) {
		numbers.forEach( (number) -> {
			System.out.println( number % 2 == 0);
//			break;
		});
	
		// TODO Auto-generated method stub
		
	}
	private static void shortList(List<Integer> numbers) {
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
	}
	private static List<Integer> createList() {
		// TODO Auto-generated method stub
		List<Integer> numbers  = new ArrayList<Integer>();
		numbers.add(1);
//		System.out.println(numbers.get(0));
		for(int count = 0; count < 20;count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
