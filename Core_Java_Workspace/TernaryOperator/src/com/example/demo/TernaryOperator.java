package com.example.demo;

public class TernaryOperator {
	
public static void main(String[] args) {
	
	
	boolean a1;
	a1 = (5<4)? true : false;
	System.out.println(a1);
	
	int a2;
	a2 = (10==9) ? 1 : 0;
	System.out.println(a2);
	
	int age = 12;
	String a = "Allowed to vote";
	String b = "Not allowed to vote";
	String accessallowed = (age > 18) ? a : b;
	System.out.println(accessallowed);
}
	
	
}

