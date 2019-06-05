package com.example2;

//Our functional interface to test dogs
@FunctionalInterface
public interface DogQuerier {
	public boolean test(Dog d);
}
