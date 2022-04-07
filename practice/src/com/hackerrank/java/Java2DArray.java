package com.hackerrank.java;

public class Java2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				int sum = sum(arr, row, col);
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);

	}

	private static int sum(int[][] no, int r, int c) {
		int sum = no[r + 0][c + 0] + no[r + 0][c + 1] + no[r + 0][c + 2] + no[r + 1][c + 1] + no[r + 2][c + 0]
				+ no[r + 2][c + 1] + no[r + 2][c + 2];
		return sum;
	}

}
