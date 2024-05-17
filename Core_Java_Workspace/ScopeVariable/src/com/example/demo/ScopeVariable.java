package com.example.demo;

public class ScopeVariable {

	static int i = 100;

	public static void main(String[] args) {

		{
			int i = 5;
			System.out.println(i);
		}
		System.out.println(i);

		int j;
		for (j = 1; j < 6; j++) {
			System.out.println(j);
		}
		System.out.println(j);
	}
}
