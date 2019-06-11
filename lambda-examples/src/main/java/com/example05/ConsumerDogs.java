package com.example05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDogs {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		Dog zooey = new Dog("zooey", 45, 8);
		dogs.add(boi);
		dogs.add(clover);
		dogs.add(zooey);
		
		Consumer<Dog> displayName = d -> System.out.print(d + " ");
		dogs.forEach(displayName);	// line 10
		
		// Now let's say we want to display the dog's name andThen we want to have the
		// dog bark. Can we do it with consumers? Yes! Here's how:
		dogs.forEach(displayName.andThen(d -> d.bark()));
		
		// dogs.forEach((d -> System.out.print(d + " ")).andThen(d -> d.bark()));	// WON'T COMPILE!
		
		// You can, however, use named consumers for both:
		Consumer<Dog> displayName2 = d -> System.out.print(d + " ");
		Consumer<Dog> doBark = d -> d.bark();
		dogs.forEach(displayName2.andThen(doBark));
	}
}

/*

boi clover zooey boi Woof!
clover Woof!
zooey Woof!
boi Woof!
clover Woof!
zooey Woof!

*/