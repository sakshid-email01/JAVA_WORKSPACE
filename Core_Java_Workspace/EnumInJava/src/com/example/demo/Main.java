package com.example.demo;

public class Main {
	public static void main(String[] args) {
		Demo demo= Demo.COREJAVA;
		
		switch(demo){
		case COLLECTIONS:
			System.out.println("Step 2 : Learning Collections framework");
			break;
		case COREJAVA:
			System.out.println("Step 1 : learning Core Java");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning Generics ");
			break;
		case MUILTITHREADING:
			System.out.println("Step 4 : Learning MuiltThreading");
			break;
		default:
			System.out.println("Element not in the enumarated list");
			break;
		
		}
		
//		for(Demo temp: Demo.values()){
//			System.out.println(temp.ordinal());
//		}
	}
	
}
