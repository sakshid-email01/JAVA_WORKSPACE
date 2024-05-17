package com.example.demo;

import java.util.Collections;
import java.util.LinkedList;

public class SortAndReverse {

	public static void main(String[] args) {
		
		SortAndReverse sortAndReverse = new SortAndReverse();

		LinkedList<Integer> numbers1 = new LinkedList<Integer>();
		numbers1.add(4);
		numbers1.add(2);
		numbers1.add(1);
		numbers1.add(3);
		sortAndReverse.display(numbers1);
		numbers1.sort(null);
		sortAndReverse.display(numbers1);
	    Collections.reverse(numbers1);
		sortAndReverse.display(numbers1);


	}
	
	private void display(LinkedList<Integer> numbers1) {
		for (int i : numbers1) {
		      System.out.println(i);
		    }
	}

}
