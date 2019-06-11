package com.example17;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference {

	public static void main(String[] args) {
		List<String> trees = Arrays.asList("fir", "cedar", "pine");
		trees.forEach(System.out::println);
	}
}
