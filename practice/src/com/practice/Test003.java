/**
 * 
 */
package com.practice;

import java.util.Stack;

/**
 * @author Govin
 *
 */
public class Test003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "{a{bc}d}{";
		Stack<Character> opening = new Stack<Character>();
		Stack<Character> closing = new Stack<Character>();
		char[] brackets = text.toCharArray();
		for (char bracket : brackets) {
			if (bracket == '{' || bracket == '}')
			closing.push(bracket);
			if (bracket == '{') {
				opening.push(bracket);
			}else if(bracket == '}')
				opening.pop();
		}

		System.out.println(closing.toString());

//	    return  opening.size()+closing.size();
	}

}
