package com.example4;

import java.util.*;
import java.util.function.*;

public class TestDogPredicates {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		Dog aiko = new Dog("aiko", 50, 10);
		Dog zooey = new Dog("zooey", 45, 8);
		Dog charis = new Dog("charis", 120, 7);
		
		dogs.add(boi); dogs.add(clover); dogs.add(aiko);
		dogs.add(zooey); dogs.add(charis);
		
		System.out.println("--- All dogs ---");
		dogs.forEach(d -> System.out.println(d));
		
		System.out.println("--- Dogs younger than 9 ---");
		printDogIf(dogs, (d) -> d.getAge() < 9);
		
		System.out.println("--- Dogs 9 or older ---");
		printDogIf(dogs, (d) -> d.getAge() >= 9);
		
		Predicate<Dog> findCs = (d) -> d.getName().startsWith("c");
		dogs.removeIf(findCs);
		System.out.println("---- After removing dogs whose names begin with c ---");
		dogs.forEach(d -> System.out.println(d));
		
		Predicate<Dog> age6 = (d) -> d.getAge() == 6;
		System.out.println("Is boi NOT 6" + age6.negate().test(boi));
		
		Predicate<Dog> name = d -> d.getName().equals("boi");
		Predicate<Dog> age = d -> d.getAge() == 6;
		Predicate<Dog> nameAndAge = d -> name.and(age).test(d);
		System.out.println("--- Test name and age of boi ---");
		System.out.println("Is boi named 'boi' and age 6? " + nameAndAge.test(boi));
		boi.setAge(7);
		System.out.println("Is boi named 'boi' and age 6? " + nameAndAge.test(boi));
		
		Predicate<Dog> nameAndAgeVer2 = name.and(age);
		System.out.println("--- Test name and age of boi ---");
		System.out.println("Is boi named 'boi' and age 6? " + nameAndAgeVer2.test(boi));
		
		// The static method in Predicate, isEqual(), just gives you a way to test if
		// one object equals another, using the same test as equals() uses when comparing
		// two objects (that is, are they the same object?).
		Predicate<Dog> p = Predicate.isEqual(zooey);
		System.out.println("Is aiko the same object as zooey? " + p.test(aiko));
		System.out.println("Is zooey the same object as zooey? " + p.test(zooey));
	}

	public static void printDogIf(ArrayList<Dog> dogs, Predicate<Dog> p) {
		for (Dog d : dogs) {
			if (p.test(d)) {
				System.out.println(d);
			}
		}
	}
}

/*

--- All dogs ---
boi is 6 years old and weighs 30 pounds
clover is 12 years old and weighs 35 pounds
aiko is 10 years old and weighs 50 pounds
zooey is 8 years old and weighs 45 pounds
charis is 7 years old and weighs 120 pounds
--- Dogs younger than 9 ---
boi is 6 years old and weighs 30 pounds
zooey is 8 years old and weighs 45 pounds
charis is 7 years old and weighs 120 pounds
--- Dogs 9 or older ---
clover is 12 years old and weighs 35 pounds
aiko is 10 years old and weighs 50 pounds
---- After removing dogs whose names begin with c ---
boi is 6 years old and weighs 30 pounds
aiko is 10 years old and weighs 50 pounds
zooey is 8 years old and weighs 45 pounds
Is boi NOT 6false
--- Test name and age of boi ---
Is boi named 'boi' and age 6? true
Is boi named 'boi' and age 6? false
--- Test name and age of boi ---
Is boi named 'boi' and age 6? false
Is aiko the same object as zooey? false
Is zooey the same object as zooey? true


*/