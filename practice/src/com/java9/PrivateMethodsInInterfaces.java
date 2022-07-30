/**
 * 
 */
package com.java9;

/**
 * @author Govin
 * 
 *         In Java 8, we can provide method implementation in Interfaces using
 *         Default and Static methods. However we cannot create private methods
 *         in Interfaces.
 * 
 *         To avoid redundant code and more re-usability, Oracle Corp is going
 *         to introduce private methods in Java SE 9 Interfaces. From Java SE 9
 *         onwards, we can write private and private static methods too in an
 *         interface using a ‘private’ keyword.
 * 
 *         These private methods are like other class private methods only,
 *         there is no difference between them.
 *
 */
public class PrivateMethodsInInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

interface Card {

	private Long createCardID() {
		return 1L;
		// Method implementation goes here.
	}

	private static void displayCardDetails() {
		// Method implementation goes here.
	}

}
