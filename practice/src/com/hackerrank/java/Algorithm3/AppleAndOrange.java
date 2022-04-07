/**
 * 
 */
package com.hackerrank.java.Algorithm3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Govin
 *
 */
public class AppleAndOrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] apple = { 2 };
		Integer[] orange = { -2 };
		countApplesAndOranges(2, 3, 1, 5, Arrays.asList(apple), Arrays.asList(orange));
		System.out.println(kangaroo(0,3,4,2));

	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		// Write your code here
//		List<Integer> appCal = new ArrayList<>();
		Integer countA = 0;
		for (Integer no : apples) {
			if ((no + a) >= s && (no + a) <= t)
				countA += 1;
		}

		Integer countO = 0;
		for (Integer n : oranges) {
			if ((n + b) <= t && (n + b) >= s)
				countO += 1;
		}

		System.out.println(countA + "\n" + countO);

	}

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here
		int vdiff = v1 - v2;
		if (vdiff <= 0) {
			return "NO";
		}
		int xdiff = x1 - x2;
		return (xdiff % vdiff == 0 ? "YES" : "NO");

	}

}
