package com.example13;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		Map<String, String> aprilWinner = new TreeMap<>();
		aprilWinner.put("April 2017", "Bob");
		aprilWinner.put("April 2016", "Annette");
		aprilWinner.put("April 2015", "Lamar");
		System.out.println("--- List, before checking April 2014 ---");
		aprilWinner.forEach((k, v) -> System.out.println(k + ": " + v));
		
		// no key for April 2014, so John Doe gets added to the map
		// computeIfAbsent takes a key and a Function
		aprilWinner.computeIfAbsent("April 2014", (k) -> "John Doe");
		
		// key April 2014 now has a value, so Jane won't be added
		aprilWinner.computeIfAbsent("April 2014", (k) -> "Jane Doe");
		System.out.println("--- List, after checking April 2014 ---");
		aprilWinner.forEach((k, v) -> System.out.println(k + ": " + v));
		
		// use a BiFunction to replace all values in the map with uppercase values
		// replaceAll takes a BiFunction.  replaceAll has two arguments, a key and the 
		// current value in the map for that key.
		aprilWinner.replaceAll((key, oldValue) -> oldValue.toUpperCase());
		System.out.println("--- List, after replacing values with uppercase ---");
		aprilWinner.forEach((k, v) -> System.out.println(k + ": " + v));
		
		Function<Integer, Integer> id = Function.identity();
		System.out.println(id.apply(42));
	}
}