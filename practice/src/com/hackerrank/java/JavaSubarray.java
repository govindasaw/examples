package com.hackerrank.java;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int no[] = new int[l];
		int c = 0, s = 0, k = 0;
		while (sc.hasNext()) {
			no[k++] = sc.nextInt();
		}
		for (int i = 0; i < l; i++) {
			for (int j = i; j < l; j++) {
				s = s + no[k];
				if (s < 0)
					c++;
			}
			s = 0;
		}
		System.out.println(c);
		sc.close();
	}

}
