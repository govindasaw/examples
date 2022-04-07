/**
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
Lily decides to share a contiguous segment of the bar selected such that:
 1. The length of the segment matches Ron's birth month, and,
 2. The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.
 */
package com.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @author Govin
 *
 */
public class Test005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(new Integer[] { 2, 3, 4, 4, 2, 1, 2, 5, 3, 4, 4, 3, 4, 1, 3, 5, 4, 5, 3, 1, 1,
				5, 4, 3, 5, 3, 5, 3, 4, 4, 2, 4, 5, 2, 3, 2, 5, 3, 4, 2, 4, 3, 3, 4, 3, 5, 2, 5, 1, 3, 1, 4, 2, 2, 4, 3,
				3, 3, 3, 4, 1, 1, 4, 3, 1, 5, 2, 5, 1, 3, 5, 4, 3, 3, 1, 5, 3, 3, 3, 4, 5, 2 });
		int d = 26, m = 8;
		int c = 0;
		int sum = 0;
		for (int i = 0; i < s.size(); i++) {
			if (m == 1 && s.get(i) == d)
				c++;
			else {
				for (int j = 0; j < m && (i + j) != s.size(); j++) {
					sum += s.get(i + j);
				}
				if (sum == d)
					c++;
				sum = 0;
			}
		}

		System.out.println(c);

	}

}
