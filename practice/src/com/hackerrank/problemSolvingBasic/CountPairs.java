/**
 * 
 */
package com.hackerrank.problemSolvingBasic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Govin
 *
 */
public class CountPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = Arrays.asList(8, 12, 16, 4, 0, 20);
		int k = 4;
		System.out.println(l1);
		System.out.println(countPairs(l1, k));		

	}

	public static int countPairs(List<Integer> numbers, int k) {
		// 1. Save only distinct numbers into HashMap.
		// 2. Now, filter for each key where (key + k) i.e b exists.
		// 3. finally count of this will give us distinct pairs from numbers.
		// O(n)
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : numbers) {
			if (!map.containsKey(i)) {
				map.put(i, i);
			}
		}
		System.out.println(map);

		int count = (int) map.keySet().stream().filter(key -> map.containsKey(key + k)).count();

		return count;
	}

}
