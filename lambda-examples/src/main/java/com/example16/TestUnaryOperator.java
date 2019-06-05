package com.example16;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<Double> log2 = (v) -> Math.log(v) / Math.log(2);
		System.out.println(log2.apply(8.0));
		
		UnaryOperator<Integer> id = UnaryOperator.identity();
		System.out.println(id.apply(42));
		
		UnaryOperator<String> upper = (name) -> name.toUpperCase();
		System.out.println(upper.apply("john"));
	}
}
