package com.example1;

public class TestDogs {
	public static void main(String[] args) {
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		
		// We don't need this inner class anymore; replace with a lambda
		//DogQuerier dq = new DogQuerier() {
		//	public boolean test(Dog d) { return d.getAge() > 9; }
		//};
		
		DogQuerier dq = d -> d.getAge() > 9;	// replaces the inner class
		System.out.println("Is Boi older than 9? " + dq.test(boi));
		System.out.println("Is Clover older than 9? " + dq.test(clover));
	}
}
/*
Is Boi older than 9? false
Is Clover older than 9? true

*/