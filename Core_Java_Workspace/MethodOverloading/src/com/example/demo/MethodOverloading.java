package com.example.demo;

public class MethodOverloading {

	public static void main(String[] args) {

		// Method Overloading with different number of parameter
		System.out.println("Area of rectangle " + area(14.25d, 10.65d));
		System.out.println("Area of Square " + area(5.0d));
		
		//Method overloading with a different data type of parameter
		System.out.println("1+2=" + sum(1, 2));
		System.out.println("1+2.5=" + sum(1, 2.5f));
		System.out.println("1.3+2.3=" + sum(1.3, 2.3));
		
		//Method overloading with the difference in order of parameters
		orderParameters("Ajay" ,10);
		orderParameters(10, "Ajay");	

	}

	public static double area(double length, double width) {
		return (length * width);
	}

	public static double area(double side) {
		return (side * side);
	}
	
	public static float sum(int x, float y) {
		System.out.println("Adding one integer and one float entity");
		return x + y;
	}
 
	public static double sum(double x, double y) {
		System.out.println("Adding two double entities");
		return x + y;
	}
	
	public static void orderParameters(int id,String name){
		System.out.println("Id:" +id+ "Name:" +name);
	}	
 
	public static void orderParameters(String name,int id){
		System.out.println("Name:" + name + "Id :" +id);
	}
}


