package com.example03;

import java.util.Map;
import java.util.function.BiConsumer;

public class Consumers {
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		User user = new User();
		BiConsumer<String, String> findUsername = (key, value) -> {
			if ("USER".equals(key)) {
				user.setUsername(value);
			}
		};
		
		env.forEach(findUsername);
		System.out.println("Username from env: " + user.getUsername());
	}
}

class User {
	String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}
}
