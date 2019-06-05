package com.example6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class TestBiPredicate {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		// fill the books list with books here...
		Book b1 = new Book("Your Brain is Better with Java", 58.99);
		Book b2 = new Book("OCP8 Java Certification Study Guide", 53.39);
		Book b3 = new Book("Is Java Coffee or Programming?", 39.86);
		Book b4 = new Book("While you were out Java happened", 12.99);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		BiPredicate<String, Double> javaBuy = (name, price) -> name.contains("Java");
		BiPredicate<String, Double> priceBuy = (name, price) -> price < 55.00;
		BiPredicate<String, Double> definitelyBuy = javaBuy.and(priceBuy);
		
		books.forEach(book -> {
			if (definitelyBuy.test(book.getName(), book.getPrice())) {
				System.out.println("You should definitely buy " + book.getName() + "(" + book.getPrice() + ")");
			}
		});
	}
}

class Book {
	String name;
	Double price;
	
	Book(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
