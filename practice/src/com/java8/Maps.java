/**
 * 
 */
package com.java8;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Govin
 *
 */
public class Maps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 1);
		hm.put('c', 2);
		hm.put('d', 5);
		hm.put('b', 3);

		HMForeach(hm);
		iterateValuesUsingLambda(hm);
	}

	public static void HMForeach(HashMap<Character, Integer> hm) {
		hm.forEach((k, v) -> System.out.println((k + ":" + v)));
	}

	public static void iterateValuesUsingLambda(Map<Character, Integer> map) {
		map.values().forEach(v -> System.out.println(("value: " + v)));
	}

}
