package com.example.demo;

public class MethodCallByValue {

	public static void main(String[] args) {

		int number = 10;
		System.out.println("value before method call : " + number);
		increment(number);
		System.out.println("value after method call: " + number);

	}

	public static void increment(int number) {
		number = number + 1; // increment variable by 1
		System.out.println("value in method: " + number);
	}
}
