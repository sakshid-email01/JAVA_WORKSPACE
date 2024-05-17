package com.example.demo;

public class Main {
	public static void main(String[] args) {
		System.out.println("Current variable value: " + AccessingStaticMember.getStaticVariable());
		AccessingStaticMember.setStaticVariable(1);
		System.out.println("Current variable value: " + AccessingStaticMember.getStaticVariable());
		AccessingStaticMember.setStaticVariable(24);
		System.out.println("Current variable value: " + AccessingStaticMember.getStaticVariable());
		
		
		AccessingStaticMember.Inner.testingInnerMethod();
        System.out.println(AccessingStaticMember.Inner.x);
	}

}
