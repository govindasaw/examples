package com.hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int d = in.nextInt();
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				row.add(in.nextInt());
			}

			list.add(row);
		}

		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			try {
				System.out.println(list.get(x - 1).get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
	}

}
