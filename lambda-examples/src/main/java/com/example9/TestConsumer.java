package com.example9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> redOrBlue = pill -> {
			if ("red".equals(pill)) {
				System.out.println("Down the rabbit hole");
			}
			else if ("blue".equals(pill)) {
				System.out.println("Stay in lala land");
			}
		};

		redOrBlue.accept("red");
		
		// BiConsumer example
		Map<String, String> env = System.getenv();
		BiConsumer<String, String> printEnv = (key, value) -> {
			System.out.println(key + ": " + value);
		};
		
		printEnv.accept("USER", env.get("USER"));
		
		// Another example
		List<String> dogNames = Arrays.asList("boi", "clover", "zooey");
		Consumer<String> printName = name -> System.out.println(name);
		dogNames.forEach(printName);	// pass the printName consumer to forEach()
		
		// We could, of course, combine the last two of these lines, like this:
		dogNames.forEach(name -> System.out.println(name));
		
		// the forEach() method of Map expects BiConsumer
		env.forEach(printEnv);
	}
}
