package com.example.demo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
        Demo arr[] = new Demo[n];
 
        arr[0] = new Demo(4, "abc");
        arr[1] = new Demo(2, "a");
        arr[2] = new Demo(3, "bc");
        arr[3] = new Demo(1, "a");

        Arrays.sort(arr);
 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

	}

}
