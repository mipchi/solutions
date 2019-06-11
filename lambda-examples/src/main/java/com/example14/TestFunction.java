package com.example14;

import java.util.function.Function;

public class TestFunction {
	public static void main(String[] args) {
		Function<Integer, String> answer = a -> {
			if (a == 42) {
				return "forty-two";
			}
			else {
				return "No answer for you!";
			}
		};

		System.out.println(answer.apply(42));
		System.out.println(answer.apply(64));
	}
}

/*
forty-two
No answer for you!
*/