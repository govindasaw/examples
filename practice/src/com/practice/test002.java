package com.practice;

import java.util.HashMap;
import java.util.HashSet;

public class test002 {

	HashMap<String, String> password = new HashMap<String, String>();

	public static void main(String[] args) {
		System.out.println(nu());
		test002 t = new test002();
		HashSet hs = new HashSet();
		hs.add(t);
	}

	public static int nu() {
		try {
			throw new Exception("exp");
		} catch (Exception e) {
			System.out.println("exception"+e);
			return 1;
		} finally {
			System.out.println("finally");
		}

	}

}
