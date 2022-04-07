/**
 * 
 */
package com.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Govin
 *
 */
public class Test011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] qn = { "q1", "q2", "q3c", "q3a", "q3b" };
		String[] ans = { "OK", "WRONG", "OK", "Time Exceded", "OK" };
		System.out.println(solution(qn, ans) + "%");

	}

	public static int solution(String[] t, String[] r) {

		Map<String, String> q = new HashMap<>();
		int c = 0;
		String tmp = "";

		for (int i = 0; i < t.length; i++) {
			if (Character.isDigit(t[i].charAt(t[i].length() - 1)))
				q.put(t[i], r[i]);
			else {
				if (q.containsKey(t[i].substring(0, t[i].length() - 1))) {
					tmp = q.get(t[i].substring(0, t[i].length() - 1)) + " " + r[i];
					q.put(t[i].substring(0, t[i].length() - 1), tmp);
				} else
					q.put(t[i].substring(0, t[i].length() - 1), r[i]);

			}
		}
		int count = (int) q.keySet().stream().filter(obj -> (!q.get(obj).contains("Time Exceded")))
				.filter(obj -> (!q.get(obj).contains("WRONG"))).count();

		return (count * 100) / q.size();

	}
}
