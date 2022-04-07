/**
 * 
 */
package com.practice;

import java.time.LocalDate;

/**
 * @author Govin
 *
 */
public class Test010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate newDate1 = LocalDate.now();
		LocalDate newDate2 = LocalDate.now().plusDays(1);
		System.out.println(newDate1.compareTo(newDate2));
		System.out.println(newDate2.compareTo(newDate1));
		System.out.println(add(2));
		System.out.println(add(2.5f));
		Character c = Character.valueOf('A');
		Character c1 = Character.valueOf('%');
		Character c2 = Character.valueOf('0');
		System.out.println(c.isAlphabetic(c));
		System.out.println(c1.isDigit(c2));
	

	}

	static int add(int no) {
		return no;
	}
	static float add(float no) {
		return no;
	}

}
