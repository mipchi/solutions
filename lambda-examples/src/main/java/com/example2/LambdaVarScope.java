package com.example2;

class LambdaVarScope {
	
	public void doStuff() {
		int numCats = 3;
		
		DogQuerier dqWithCats = d -> {
			int numBalls = 1;	// completely new variable local to lambda
//			numCats++;
			numBalls++;	// can modify numBalls
			System.out.println("Number of balls: " + numBalls);	// can access numBalls
			System.out.println("Number of cats: " + numCats);	// can access numCats
			return d.getAge() > 9;
		};
		
		Dog clover = new Dog("clover", 35, 12);
		
		System.out.println("--- use DogsPlay ---");
		DogsPlay dp = new DogsPlay(dqWithCats);
		System.out.println("Is Clover older than 9? " + dp.doQuery(clover));		
	}
	
	public static void main(String[] args) {
		LambdaVarScope lvs = new LambdaVarScope();
		lvs.doStuff();
	}
}
/*
--- use DogsPlay ---
Number of balls: 2
Number of cats: 3
Is Clover older than 9? true

*/