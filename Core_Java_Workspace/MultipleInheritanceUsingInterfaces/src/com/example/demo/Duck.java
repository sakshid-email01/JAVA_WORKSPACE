package com.example.demo;

public class Duck implements Walk, Swim {

	@Override
	public void swimmable() {
		// TODO Auto-generated method stub
		System.out.println("Duck is swimming."); 
	}

	@Override
	public void walkable() {
		// TODO Auto-generated method stub
		System.out.println("Duck is walking."); 
	}

}
