package com.example.demo;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.apache.commons.lang.StringEscapeUtils;

public class T{
	
	 


	
public static final void main(String... args) {
/*	List<Integer> asList = Arrays.asList(1,2);
    String sJava="\\u0048\\u0065\\u006C\\u006C\\u006F";
  
    char ch = '\u0048';
    char ch1 = '\u0065';
    String unescapeJava = StringEscapeUtils.unescapeJava(sJava);
    System.out.println(ch);
    System.out.println(ch1);
    
    
    int h = 7;
    int i = 8;
    Integer reduce = asList.stream().reduce(0, Integer::sum);
    System.out.println(reduce);

    Runnable withLambda = () -> System.out.println(" Runnable example with lambda exp.");
    Thread thread1 = new Thread(withLambda);
    thread1.start();
    
    Sayable withLambda1 = () -> {
        return "Return something ..";
    };
    
   *
   */
	
	 // declare a reference to MyInterface
    MyInterface ref;
    
    // lambda expression
    ref = () -> 3.1415;
    
    System.out.println("Value of Pi = " + ref.getPiValue());
	
}
}

interface MyInterface{  
	 // abstract method
    double getPiValue();  
} 

/*
 * String x = "801 has 20 value"; boolean contains = x.contains("801 20");
 * System.out.println(contains);
 * 
 * } }
 */
