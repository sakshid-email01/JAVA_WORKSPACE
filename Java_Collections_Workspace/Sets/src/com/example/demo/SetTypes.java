package com.example.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {
	
	static SetTypes setObj = new SetTypes();

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		for (int i = 3; i > 0; i--) {
			hashSet.add("A" + i);
		}
		setObj.display(hashSet);
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		for(int i = 4; i<=6; i++){
			linkedHashSet.add("A"+i);
		}
		setObj.display(linkedHashSet);

		Set<String> treeSet = new TreeSet<>();
		for(int i = 7; i<=9; i++){
			treeSet.add("A"+i);
		}
		setObj.display(treeSet);

	}

	private static void display(Set<String> demo) {
		for (String i : demo) {
			System.out.println(i);
		}
		System.out.println("*****************************");
	}

}
