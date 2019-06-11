package com.example05;

//Our trusty Dog class
public class Dog {
	private String name;
	private int weight;
	private int age;

	public Dog() { }
	
	public Dog(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	public String getName() { return this.name; }
	public int getWeight() { return this.weight; }
	public int getAge() { return this.age; }
	
	@Override
	public String toString() { return this.name; }
	
	public void bark() { System.out.println("Woof!"); }
}
