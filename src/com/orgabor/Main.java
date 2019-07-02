package com.orgabor;

interface TestInterface {
	public void demoMethod(int x, int y); // only a single method is allowed for lambda == "functional interface"
}

public class Main {

	public static void main(String[] args) {
		
//		TestInterface test = new TestInterface() { // implemented with anonymous inner class
//
//			@Override
//			public void demoMethod() {
//				System.out.println("Statement 1");
//			}
//			
//		};
		
		
		// Now with lambda expression! :
		
		TestInterface test = (x, y) -> { // {} in case of multiple statements
//			System.out.println("Statement 1");
//			System.out.println("Statement 2");
			System.out.println(x + y);
		}; // ; !!!
		
		test.demoMethod(1, 2);
	}

}
