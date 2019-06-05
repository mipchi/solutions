package com.example3;

import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		
		Predicate<Dog> p = d -> d.getAge() > 9;
		System.out.println("Is Boi older than 9? " + p.test(boi));
		System.out.println("Is Clover older than 9? " + p.test(clover));
	}
}
