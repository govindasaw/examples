/**
 * 
 */
package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Govin
 *
 */
public class Test018 implements Fun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = { 1, 0, 0, 0, 1, 0, 1 };
		// output :- [1,1,1,0,0,0,0]

		LinkedList<Integer> list = new LinkedList<>();
		for (Integer i : array) {
			if (i == 1)
				list.addFirst(i);
			else
				list.addLast(i);
		}
		System.out.println(list);

		List<Integer> list1 = Arrays.asList(array);

		Map<Integer, Long> result = list1.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

		Test018 t = new Test018();
		t.abc();
		Fun.ch();
		t.method1();
	}

	@Override
	public Integer abc() {
		// TODO Auto-generated method stub
		System.out.println("abc");
		return 1;
	}

}

@FunctionalInterface
interface Fun {

	Integer abc();

	public static void ch() {
		System.out.println("static method ch");
	}

	default int method1() {
		System.out.println("default method");
		return 0;

	}

}
