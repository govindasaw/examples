/**
 * 
 */
package com.hackerrank.problemSolvingBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Govin
 *
 */
public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = new String[] { "Avinash", "Amol", "John", "Peter" };
		List<Integer> cost = new ArrayList<Integer>();
		cost.add(2);
		List n = Arrays.asList(names);
		maxCost(cost, n, 1);

	}

	public static void maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
		int sum = 0;
		int c = 0;
		int max = 0;
		List<Integer> maxCount = new ArrayList();
		for (int i = 0; i < cost.size(); i++) {
			if (c == dailyCount) {
				maxCount.add(sum);
				sum = 0;
				c = 0;
			} else {
				sum += cost.get(i);
				c++;
			}

		}
		Collections.sort(maxCount, Collections.reverseOrder());
		max = (int) maxCount.get(0);
		System.out.println(max);

	}

}
