package com.example15;

import java.util.function.BiFunction;

public class TestBiFunction {

	public static void main(String[] args) {
		// Takes two Strings and returns a String
		BiFunction<String, String, String> firstLast = (first, last) -> first + " " + last;
		System.out.println("First and Last name: " + firstLast.apply("Joe", "Smith"));
	}
}
