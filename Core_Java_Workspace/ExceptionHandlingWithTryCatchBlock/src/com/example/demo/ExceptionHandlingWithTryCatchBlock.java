package com.example.demo;

public class ExceptionHandlingWithTryCatchBlock {

	public static void main(String[] args) {

		int x = 0;
		try {

			System.out.println("Exception Handling " + x / 0);

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		} catch (Exception e) {
			System.out.println("Inside exception block");
		}
	}
}
