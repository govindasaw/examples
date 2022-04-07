/**
 * 
 */
package com.java8;

/**
 * @author Govin
 *
 */

//This is Program To implement the Interface
interface car {
	void display();
}

public class Model implements car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model obj = new Model();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("im a Car");

	}

}
