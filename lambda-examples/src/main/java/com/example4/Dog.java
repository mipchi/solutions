package com.example4;

public class Dog {
	private String name;
	private int age;
	private int weight;
	
	public Dog(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void bark() { 
		System.out.println("Woof!");
	}

	// add a better description of the dog:
	@Override
	public String toString() {
		return this.name + " is " + this.age + " years old and weighs " +
				this.weight + " pounds";
	}
}
