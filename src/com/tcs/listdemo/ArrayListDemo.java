package com.tcs.listdemo;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
//		shortList(numbers);
//		filterList(numbers);
//		add(numbers);
//		System.out.println("after sorging="+numbers);
		otherOps(numbers);
	}
	private static void otherOps(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.add(1,50);
		System.out.println(numbers);
		// TODO Auto-generated method stub
		
	}
	private static void add(List<Integer> numbers) {
		Optional<Integer> sum1 = numbers.stream()
				.reduce((Integer sum, Integer number)-> {
					System.out.println(sum+" "+number);
					return sum + number;
				});
		System.out.println(sum1.get());
		// TODO Auto-generated method stub
		
	}
	//method to filter elements
	private static void filterList(List<Integer> numbers) {
		numbers.forEach( (number) -> {
			System.out.println( number % 2 == 0);
//			break;
		});
//		List<Integer> filtered = numbers.stream()
//				.filter((number)-> number % 2 == 0)
//				.collect(Collectors.toList());
//			System.out.println(filtered);
//		
	
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
