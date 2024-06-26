package com.example.demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//To sort the data of this custom type a comparator interface is implemented with custom logic.
//It will sort the data in key order.

public class Main {

	public static void main(String[] args) {
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
			 
			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else
					return 0;
			}
		};
	
 
		Set<Data<Integer, String>> set = new TreeSet<>( COMPARE_KEY);
 
		set.add(new Data<Integer, String>(1, "One"));
		set.add(new Data<Integer, String>(5, "Five"));
		set.add(new Data<Integer, String>(9, "Nine"));
		set.add(new Data<Integer, String>(2, "Two"));
 
		for (Data<Integer, String> element : set) {
			System.out.println(element);
		}
	}
}
