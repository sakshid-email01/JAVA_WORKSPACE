package com.example.demo;

public class Shop {

public void check(String key) {
	if (new Door().isLocked(key)) {
		System.out.println("Shop has closed, visit later");
	} else {
		System.out.println("Welcome, we are open :)");
	}
}
		

	
}
