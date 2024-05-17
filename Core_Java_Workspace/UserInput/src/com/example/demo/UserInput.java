package com.example.demo;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		System.out.println("What's your age?");
		Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
        sc.close();	}
}
