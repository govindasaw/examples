/**
 * 
 */
package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Govin
 *
 */
public class Test008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String input3 = sc.nextLine();
		int b = Integer.parseInt(input1.split(" ")[0]);
		String SK[] = input2.split(" ");
		String SD[] = input3.split(" ");
		int[] k = Arrays.stream(SK).mapToInt(Integer::parseInt).toArray();
		int[] d = Arrays.stream(SD).mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		int max = 0;
		for (int i = k.length - 1; i >= 0; i--) {
			for (int j = d.length - 1; j >= 0; j--) {
				sum = k[i] + d[j];
				if (sum >= max && sum <= b) {
					max = sum;
				}
			}
		}
		if (max == 0)
			System.out.println(-1);
		else
			System.out.println(max);
	}

}
