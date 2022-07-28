package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		String s = "Hello how are you";
		IntStream chars = s.chars();
		Stream<Character> mapToObj = chars.mapToObj(i->(char)i);
	    HashMap<Character,Long> collect = mapToObj.collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
	    collect.forEach((c,v)->System.out.println(c+":"+v));
	    
	    
	    char[] charArray = s.toCharArray();
	    Map<Character,Long> map = new HashMap<>();
	    
	    for(char x: charArray) {
	    	if(map.containsKey(x)) {
	    		Long long1 = map.get(x);
	    		map.put(x, ++long1);
	    	}else {
	    		map.put(x, (long) 1);
	    	}
	    }
	    System.out.println("kkkkkkkkkkkkkkkkkkkk");
	    map.forEach((v,v1)->System.out.println(v+":"+v1));
	    
	   
	    
	   // ()->System.out.println("hello");
		
	}

}
