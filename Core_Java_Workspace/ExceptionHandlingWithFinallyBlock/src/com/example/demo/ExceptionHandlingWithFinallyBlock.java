package com.example.demo;

public class ExceptionHandlingWithFinallyBlock {

	public static void main(String[] args) {

		int x = 2;
		try {

			System.out.println("output: " + x / 2);

		} catch (RuntimeException e) {
			System.out.println("Runtime exception");

		} catch (Exception e) {
			System.out.println("Exception!!!");
		} finally {
			System.out.println("This will be get printed");
			System.out.println();
		}
	}
}
