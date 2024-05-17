package com.example.demo;

public class Demo implements Comparable<Demo> {
	
	//A comparable Interface is used to sort the custom-type objects. By default, a class defined by the user 
	//is not comparable. Hence, their objects cannot be compared.
	//To make an object comparable, the class must implement a comparable interface.
	// below code compares based on names and if names are same then compares based on num.
	private int num;
	private String name;
	
	public Demo(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [num=" + num + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Demo demo) {
		// if the string are not equal
        if (this.name.compareTo(demo.name) != 0) {
            return this.name.compareTo(demo.name);
        }
        else {
            // we compare int values
            // if the strings are equal
            return this.num - demo.num;
        }
	}
	
	
	
	

}
