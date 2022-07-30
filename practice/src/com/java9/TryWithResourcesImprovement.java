/**
 * 
 */
package com.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Govin
 * 
 * 
 *         We know, Java SE 7 has introduced a new exception handling construct:
 *         Try-With-Resources to manage resources automatically. The main goal
 *         of this new statement is “Automatic Better Resource Management”.
 * 
 *         Java SE 9 is going to provide some improvements to this statement to
 *         avoid some more verbosity and improve some Readability.
 *
 */
public class TryWithResourcesImprovement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TryWithResourcesImprovement.testARM_Before_Java9();
			TryWithResourcesImprovement.testARM_Java9();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// Old in java 7
	static void testARM_Before_Java9() throws IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader("TryResourceTest.txt"));
		try (BufferedReader reader2 = reader1) {
			System.out.println(reader2.readLine());
		}
	}

	// In Java 9

	static void testARM_Java9() throws IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader("TryResourceTest.txt"));
		try (reader1) {
			System.out.println(reader1.readLine());
		}
	}

}
