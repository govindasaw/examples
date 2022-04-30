/**
 * 
 */
package com.practice;

/**
 * @author Govin
 *
 */
public class Test020 extends SuperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void method() throws RuntimeException {

		// Exception is not a child exception
		// of the RuntimeException
		// So the compiler will give an error

		System.out.println("SubClass");
	}

}

class SuperClass {

	// SuperClass declares an exception
	void method() throws RuntimeException {
		System.out.println("SuperClass");
	}
}
