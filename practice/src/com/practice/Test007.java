package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abacdexyzlmnadbbbbe";
		String sub_str = "", old = "";
		String sub = "";
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (sub_str.contains("" + c[i])) {
				if (str.subSequence(i, str.length()).length() > sub_str.length()) {
					old = sub_str;
					sub_str = "" + c[i];
				}

			} else {
				sub_str = sub_str + "" + c[i];
			}
		}
		System.out.println(sub_str);
		System.out.println(getUniqueCharacterSubstring(str));

	}

	static String getUniqueCharacterSubstring(String input) {
		Map<Character, Integer> visited = new HashMap<>();
		String output = "";
		for (int start = 0, end = 0; end < input.length(); end++) {
			char currChar = input.charAt(end);
			if (visited.containsKey(currChar)) {
				start = Math.max(visited.get(currChar) + 1, start);
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end + 1);
			}
			visited.put(currChar, end);
		}
		return output;
	}

}
