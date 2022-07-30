/**
 * 
 */
package com.java10;

import java.util.List;

/**
 * @author Govin
 *
 *         Local-Variable Type Inference is the biggest new feature in Java 10
 *         for developers. It adds type inference to declarations of local
 *         variables with initializers. Local type inference can be used only in
 *         the following scenarios:
 * 
 *         1. Limited only to Local Variable with initializer 
 *         2. Indexes of enhanced for loop or indexes 
 *         3. Local declared in for loop
 */
public class LocalVariableTypeInference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var numbers = List.of(1, 2, 3, 4, 5); // inferred value ArrayList<String>
		// Index of Enhanced For Loop
		for (var number : numbers) {
			System.out.print(number);
		}
		System.out.println();
		// Local variable declared in a loop
		for (var i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i));
		}

	}

}
