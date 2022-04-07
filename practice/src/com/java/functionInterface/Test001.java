/**
 * 
 */
package com.java.functionInterface;

import java.util.function.Consumer;

/**
 * @author Govin
 *
 */
public class Test001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);

	}

}

@FunctionalInterface
interface Square {
	int calculate(int x);
}
