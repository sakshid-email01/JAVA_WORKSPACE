package com.example.demo;

public class Main {
	public static void main(String[] args) {
		Person john = new Vegan();
		john.speak();
		john.eat();
		System.out.println("=======================");
		Person dan = new NonVegan();
		dan.speak();
		dan.eat();
	}
}
