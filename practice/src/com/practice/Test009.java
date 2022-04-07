/**
 * 
 */
package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Govin
 *
 */
public class Test009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 900, 638 };
		int[] n1 = { 901, 638 };
		String[] s1 = { "Air", "Com" };
//		System.out.println(countMismatchedPayments(2, s1, n, 2, s1, n1));

	}

	static int countMismatchedPayments(int n, String[] accountNames, int[] dues, int m,
			String[] accountsPayingByCheques, int[] chequeAmounts) {
		// Write your code here
		int result = 0;
		HashMap<String, Integer> duess = new HashMap<String, Integer>();
		for (int i = 0; i < accountNames.length; i++) {
			duess.put(accountNames[i], dues[i]);
		}

		HashMap<String, Integer> paid = new HashMap<String, Integer>();
		for (int i = 0; i < accountsPayingByCheques.length; i++) {
			paid.put(accountsPayingByCheques[i], chequeAmounts[i]);
		}
		for (String c : duess.keySet()) {
			if (paid.containsKey(c)) {
				if (!(duess.get(c)).equals(paid.get(c)))
					result++;
			}
		}
		return result;

	}

	static int computeDeviceCrossovers(int n, int[] websiteVisits, int m, int[] appVisits) {
		// Write your code here
		int result = 0;
		
		if (n == 0 || m == 0)
			return 0;
		else {
			for(int i=0;i<n+m;i++) {
				
			}
			result = websiteVisits.length + appVisits.length;
		}

		return result;

	}

}
