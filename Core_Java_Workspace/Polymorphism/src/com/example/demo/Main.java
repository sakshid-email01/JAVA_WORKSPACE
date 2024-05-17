package com.example.demo;

public class Main {
	public static void main(String[] args) {
		Phone nokia3310 = new Main().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
		
		Phone apple =  new Main().phone(2);
		System.out.println(apple.getModel());
		apple.features();
		
	}
	
	public Phone phone(int dailyDriver){
		switch(dailyDriver){
		case 1: return new Nokia("nokia");
		case 2: return new Apple("apple");
		}
		return null;
	}
}
