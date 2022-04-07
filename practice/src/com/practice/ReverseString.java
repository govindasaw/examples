/**
 * 
 */
package com.practice;

/**
 * @author Govin
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCD";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);

	}

}
