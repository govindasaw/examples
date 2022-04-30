/**
 * 
 */
package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Govin
 *
 */

// Rakuten comany
public class Test016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int d = 3;
		// 4,5,6,7,8,9,10,1,2,3

		// 1 way
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(Integer i: arr)
			list.add(i);
		while (d > 0) {
			list.addLast(list.getFirst());
			list.removeFirst();
			d--;
		}
		System.out.println(list);

		// 2nd ways
		Integer tmp;
		while (d > 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
			}
			d--;
		}
		for (Integer i : arr)
			System.out.print(i + ", ");
		// geth 30 age
		Employees emp1 = new Employees(1, "name1", 28);
		Employees emp2 = new Employees(2, "name1", 30);
		Employees emp3 = new Employees(3, "name1", 45);
		Employees emp4 = new Employees(4, "name1", 41);
		Employees emp5 = new Employees(5, "name1", 29);
		List<Employees> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		List<Employees> listTwo = empList.stream().filter(obj -> obj.getAge() > 30).collect(Collectors.toList());
		System.out.println(listTwo);
//		Collections.sort((List<Employees>) listTwo);

		Integer no1 = 1;
		Integer no2 = 2;

//		// thred1
//		run(){
//		synchronized (no1) {
//			synchronized (no2) {
//				
//				
//			}
//			
//		}
//		}
//		
//		
//		//thread2
//		run(){
//			synchronized (no2) {
//				synchronized (no1) {
//					
//					
//				}
//				
//			}
//			}
	}

}

class Employees {

	private Integer id;
	private String name;
	private Integer age;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Employees(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
