package com.example11;

import java.util.Map;
import java.util.Random;
import java.util.function.*;

public class TestSupplier {
	public static void main(String[] args) {
		Supplier<Integer> answerSupplier = () -> 42;
		System.out.println("Answer to everything: " + answerSupplier.get());
		
		// old-fashioned way
		Supplier<Integer> answSupplier = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 42;
			}
		};
		
		// Another example
		Supplier<String> userSupplier = () -> {
			Map<String, String> env = System.getenv();	// get the system environment map
			return env.get("USER");		// get the value with the key "USER" from the map and
										// return it (Note: on Windows, this key is "USERNAME")
		};
		System.out.println("User is: " + userSupplier.get());
		
		// Another example
		Random random = new Random();
		IntSupplier randomIntSupplier = () -> random.nextInt(50);
		System.out.println("Random number: " + randomIntSupplier.getAsInt());
	}
}
