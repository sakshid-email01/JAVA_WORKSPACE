package com.example.demo;

import java.io.FileNotFoundException;

public class ExceptionHandlingWithUserDefinedException {

	public static void main(String[] args) {

		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method");

		}

	}

	public static void someMethod() throws FileNotFoundException {
		System.out.println("Message from someMethod");
		throw new FileNotFoundException();

	}
}
