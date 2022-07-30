/**
 * 
 */
package com.java9;

import java.util.stream.Stream;

/**
 * @author Govin
 * 
 *         In Java SE 9, Oracle Corp has added four useful new methods to
 *         java.util.Stream interface. As Stream is an interface, all those new
 *         implemented methods are default methods. Two of them are very
 *         important: dropWhile and takeWhile methods
 * 
 *         If you are familiar with Scala Language or any Functions programming
 *         language, you will definitely know about these methods. These are
 *         very useful methods in writing some functional style code. Let us
 *         discuss the takeWhile utility method here.
 * 
 *         This takeWhile() takes a predicate as an argument and returns a
 *         Stream of the subset of the given Stream values until that Predicate
 *         returns false for the first time. If the first value does NOT satisfy
 *         that Predicate, it just returns an empty Stream.
 *
 */
public class StreamAPIImprovements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> i < 5).forEach(System.out::println);
		

	}

}
