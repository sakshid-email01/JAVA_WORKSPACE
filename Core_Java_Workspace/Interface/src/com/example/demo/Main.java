package com.example.demo;

public class Main {
	
	public static void main(String[] args) {
		Phone phone = new OnePlus5();
		System.out.println("Processor: "+phone.processor());
		System.out.println("Space in GB: "+phone.spaceInGB());
		
		Phone iPhone = new Iphone();
		System.out.println("Processor: "+iPhone.processor());
		System.out.println("Space in GB: "+iPhone.spaceInGB());
	}

}
