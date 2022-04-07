/**
 * 
 */
package com.practice;

import java.util.Random;

/**
 * @author Govin
 *
 */
public class RandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Random r = new Random();
		int count = 15;
		int sum=0;
		while (flag) {
			System.out.println(sum+=r.nextInt(50));
			count--;
			
			if (count == 0 && sum<599)
				flag = false;
		}
		System.out.println();

	}

}
