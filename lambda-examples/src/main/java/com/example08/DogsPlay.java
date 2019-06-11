package com.example08;

class DogsPlay {
	DogQuerier dogQuerier;
	
	// The constructor for the DogsPlay class takes a DogQuerier instance.	
	public DogsPlay(DogQuerier dogQuerier) {
		this.dogQuerier = dogQuerier;
	}
	public boolean doQuery(Dog d) {
		return dogQuerier.test(d);
	}
}