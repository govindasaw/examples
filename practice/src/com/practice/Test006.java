package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test006 {
	public static void main(String[] args) {
		int k = 3;
		int c = 0;
		List<Integer> ar = Arrays.asList(new Integer[] { 1, 3, 2, 6, 1, 2 });
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0)
					c++;
			}
		}
		System.out.println(c);
		migratory_Birds();
		System.out.println(leap());
		bonAppetit();
		sockMerchant();
		pageCount();
		countingValleys();

	}

	public static void migratory_Birds() {
		List<Integer> arr = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4 });
		Map<Integer, Integer> bird = new HashMap<Integer, Integer>();
		int max = 0, min = 0;
		for (Integer no : arr) {
			if (bird.containsKey(no))
				bird.put(no, (bird.get(no) + 1));
			else
				bird.put(no, 1);
		}
		for (Integer no : bird.keySet()) {
			if (bird.get(no) > max) {
				max = bird.get(no);
				min = no;
			} else if (bird.get(no) == max) {
				if (min > no)
					min = no;

			}

		}
		System.out.println(min);

	}

	public static String leap() {
		int year = 2016;

		if (year >= 1700 && year <= 1917) {
			if (year % 4 == 0) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		} else {
			if (year == 1918) {
				return "26.09." + year;
			} else {
				if (year % 400 == 0) {
					return "12.09." + year;
				} else if (year % 4 == 0 && year % 100 != 0) {
					return "12.09." + year;
				} else {
					return "13.09." + year;
				}
			}
		}
	}

	public static void bonAppetit() {
		List<Integer> bill = Arrays.asList(new Integer[] { 3, 10, 2, 9 });
		int k = 1;
		int b = 7;
		int sum = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i != k)
				sum += bill.get(i);
		}
		if (b == (sum / 2))
			System.out.println("Bon Appetit");
		else {
			System.out.println(b - (sum / 2));
		}

	}

	public static void sockMerchant() {
		List<Integer> ar = Arrays.asList(new Integer[] { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 });
		Map<Integer, Integer> color = new HashMap<Integer, Integer>();
		for (Integer no : ar) {
			if (color.containsKey(no))
				color.put(no, (color.get(no) + 1));
			else
				color.put(no, 1);
		}
		int c = 0;
		for (Integer k : color.keySet())
			if (color.get(k) > 1) {
				c += color.get(k) / 2;
			}
		System.out.println(c);
	}

	public static void pageCount() {
		int n = 6;
		int p = 5;
		System.out.println((p < (n - p) ? p / 2 : (n - p) / 2));
	}

	public static void countingValleys() {
		int steps = 8;
		String path = "UDDDUDUU";
		int count = 0, no = 0;
		for (Character c : path.toCharArray()) {
			if (c == 'U')
				count += 1;
			else if (c == 'D') {
				if (count == 0) {
					no++;
				}
				count -= 1;
			}
		}
		System.out.println(no);
	}
}
