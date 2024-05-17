package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {

		List<String> demo1 = new LinkedList<>();
		demo1.add("One");
		demo1.add("Two");
		demo1.add("Three");
		demo1.add("Four");
		demo1.add("Five");
		new ListInterface().printList(demo1);
		
		List<String> demo2 = new ArrayList<>();
		demo2.add("One");
		demo2.add("Two");
		demo2.add("Three");
		demo2.add("Four");
		demo2.add("Five");
		new ListInterface().printList(demo2);

	}

	private void printList(List<String> demo) {
		// TODO Auto-generated method stub
		for(String element: demo){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}

}
