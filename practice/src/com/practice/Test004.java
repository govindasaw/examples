package com.practice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test004 {

	public static void main(String[] args) {
		String text = "geeksforgeeks";
		Integer no = 0;
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (Character c : text.toCharArray()) {
			if (hm.containsKey(c)) {
				no = hm.get(c);
				hm.put(c, no + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Character ch : hm.keySet()) {
			if (hm.get(ch).equals(1)) {
				System.out.println(ch);
				break;
			}
		}		
		LinkedList ll = new LinkedList();
		text.chars().distinct().findFirst().ifPresent(System.out::println);
	}

}
