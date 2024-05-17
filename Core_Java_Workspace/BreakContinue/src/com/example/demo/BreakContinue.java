package com.example.demo;

public class BreakContinue {
	
public static void main(String[] args) {
	
	for (int i = 1; i <= 6; i++) {
		System.out.println(i);
		if (i == 5) {
			break;
		}
	}
	
	for (int i = 1; i <= 5; i++) {
		 
		if (i == 4) {
			continue;
		}
		System.out.println(i);
	}
	
}
	
	
}

