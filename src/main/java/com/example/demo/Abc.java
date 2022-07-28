package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list);
		
		Stream<Integer> filter = list.stream().filter(i->i%2==0);
		filter.forEach(i->list1.add(i));
		list1.forEach(System.out::println);
		
		List<Integer> collect = list.stream().filter(i->-i%2==0).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		/*
		 * for(int i:list) { Stream<Integer> s=list.stream().filter(d->i%2==0); }
		 */
		 
		

	}

}
