//1. Write a method to remove a given value from array list having string values.
package com.practice;

public class testOne {

	public static void main(String[] args) throws Exception {
		manager m = new manager(1, "name", 2);
		m.just();
	}

}

class emp {
	Integer emp;
	String name;

	public emp(Integer emp, String name) {
		super();
		this.emp = emp;
		this.name = name;
	}

	public void just() throws Exception {
		System.out.println(this.toString());

	}

}

class manager extends emp {
	Integer mid;

	public manager(Integer emp, String name, Integer mid) {
		super(emp, name);
		this.mid = mid;
	}

	public void just()  {

		System.out.println(this.emp);
	}

}
