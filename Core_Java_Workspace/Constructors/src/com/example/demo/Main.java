package com.example.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo1 = new Demo();
	    demo1.setId(0);
	    demo1.setName("demo1");
	    
	    System.out.println(demo1);
	    
	    Demo demo2 = new Demo(1, "demo2");
	    System.out.println(demo2);
	}

}
