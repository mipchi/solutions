package com.example7;

public class TestTriPredicate {
	
	public void triPredicate() {
		TriPredicate<String, Integer, Integer> theTest = (s, n, w) -> {
			if (s.equals("There is no spoon") && n > 2 && w < n) {
				return true;
			} else {
				return false;
			}
		};
		
		System.out.println("Pass the test? " + theTest.test("Follow the White Rabbit", 2, 3));
		System.out.println("Pass the test? " + theTest.test("There is no spoon", 101, 3));
	}

	public static void main(String[] args) {
		TestTriPredicate ttp = new TestTriPredicate();
		ttp.triPredicate();
	}
}
/*
Pass the test? false
Pass the test? true

*/