/**
 * 
 */
package com.practice;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Govin
 *
 */
public class Test021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] no = { 1, 1, 2, 3, 3, 4, 5, 2, 1, 1, 4, 4, 3, 2, 2, 2};

		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(no));
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i).equals(list.get(i+1)))
				list.remove(i);
		}
		
		System.out.println(list);
	}

}
