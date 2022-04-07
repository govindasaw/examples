package com.java8;

//A simple program to Test Interface default
//methods in java
interface TestInterface {
	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}

	// default method
	default void show(String str) {
		System.out.println("Default Method 2 Executed " + str);
	}

	// static method
	static  void show(int no) {
		System.out.println("static  Method 3 Executed " + no);
	}
}

class DefaultMethod implements TestInterface {
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultMethod d = new DefaultMethod();
		d.square(4);

		// default method executed
		d.show();
		d.show("Two");
		TestInterface.show(3);
	}
}
