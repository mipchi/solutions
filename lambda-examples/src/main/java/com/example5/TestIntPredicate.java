package com.example5;

import java.util.function.IntPredicate;

public class TestIntPredicate {

	public static void main(String[] args) {
		IntPredicate universeAnswer = i -> i == 42;
		System.out.println("Is the answer 42? " + universeAnswer.test(42));
	}

}
