/**
 * 
 */
package com.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Govin
 *
 */
public class Test019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to check number is amstrom
		// 153 - 1*3 + 5*3 +3*3 = 1+125+27=128+27=155

//		Integer number;
//		Integer sum = 0;
//		Integer tmp;
//		Integer num1;
//		Integer count=1;
//		List<Integer> list = new ArrayList<>();
//		for(int i=1;i<2000;i++) {
//			num1 = count;
//			number = count;
//			while (number > 0) {
//				tmp = number % 10;
//				number = number / 10;
//				sum += tmp * tmp * tmp;
//			}
//			if (sum.equals(num1))
//				list.add(num1);
//			sum=0;
//			count++;
//		}
//		System.out.println(list);
		automorficNumber();
	}
	// 1-999

	public static void automorficNumber() {

		int tmp;
		int num;
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<100;i++) {
			tmp = (int) Math.sqrt(i);
			num = i;
			num = num % 10;
			
			if (tmp == num)
				list.add(i);
		}
		System.out.println(list);

	}

}
