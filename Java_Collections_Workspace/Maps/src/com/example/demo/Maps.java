package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {

		Map<Integer, String> student = new HashMap<>();
		student.put(1, "One");
		student.put(2, "Two");
		student.put(3, "Three");
		for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry);
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
			
		}
		System.out.println(student.get(3));
		
		
		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
		 
		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
		}
		
	}

}
