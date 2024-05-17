package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    Collections.sort(cars);  // Sort cars
	    for (String i : cars) {
	      System.out.println(i);
	    }
		System.out.println(Collections.binarySearch(cars, "BMW"));

	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(1);
	    myNumbers.add(2);
	    myNumbers.add(3);
	    myNumbers.add(4);

	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	}

}
