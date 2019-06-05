package com.example7;

@FunctionalInterface
interface TriPredicate<T, U, V> {
	boolean test(T t, U u, V v);
}
