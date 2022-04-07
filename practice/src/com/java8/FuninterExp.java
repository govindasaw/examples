/**
 * 
 */
package com.java8;

/**
 * @author Govin
 *
 */

//This is Program To implement the Functional Interface

interface Writable {
	void write(String txt);
}

// FuninterExp is a Example of Functional Interface
public class FuninterExp implements Writable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuninterExp obj = new FuninterExp();
		obj.write(" GFG - GEEKS FOR GEEKS ");
	}

	public void write(String txt) {
		System.out.println(txt);
	}

}
