package com.nttData;

public class ATOI {

	public static void main(String[] args) {
		int res = 0;
		String str = "-abc8978def";
		for (int i = 0; i < str.length(); ++i)
			res = res * 10 + str.charAt(i) - '0';
		System.out.println(res);

		System.out.println(atoi(str));

	}

	public static int atoi(String str) {

		if (str == null || str == "")
			return 0;
		str = str.trim();

		// check negative or positive
		int i = 0;
		char flag = '+';
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		if (flag == '-')
			result = -result;

		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) result;
	}

}
