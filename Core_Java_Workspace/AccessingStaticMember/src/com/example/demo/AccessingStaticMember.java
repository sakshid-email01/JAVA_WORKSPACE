package com.example.demo;


public class AccessingStaticMember {
 
	private static int staticVariable=0;
	 
	public static int getStaticVariable() {
		return staticVariable;
	}
 
	public static void setStaticVariable(int staticVariable) {
		AccessingStaticMember.staticVariable = staticVariable;
	}
	
	 
	public static class Inner {
        public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}

}
