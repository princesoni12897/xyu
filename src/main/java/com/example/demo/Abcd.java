package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Abcd {

	public static void main(String[] args) {
		String s = "Hello how are you";
		String s1 = "Hello how are uuuuuuu";
		String s2 = "Hello how nnnnnnnare uuuuuuu";
		
		IntStream c = s.chars();
		
		
		Stream<Character> c1 = c.mapToObj(i->(char)i);
		
		HashMap<Character,Long> collect = c1.collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));

		collect.forEach((c6,v)->System.out.println(c6+":"+v));
		
		
		char[] z= s.toCharArray();
		Map<Character,Long> map = new HashMap<Character, Long>();
		
		for(char x:z) {
			if(map.containsKey(x)) {
				Long l = map.get(x);
				map.put(x, ++l);
			}
			else {
				map.put(x, (long)1);
			}
		}
		
		map.forEach((v,v2)->System.out.println(v+":"+v2));
 	}
}
