/**
 * 
 */
package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Govin
 *
 */
public class FrequencyCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "hello", "bye", "ciao", "bye", "ciao" };
		String str1 = "aabbccde";
		count(str);
		distinct(str1.split(""));
		distinctWordSorted(str);

	}

	public static void count(String[] str) {
		List<String> wordsList = Arrays.asList(str);

		Map<String, Long> collect = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Integer> counts = wordsList.parallelStream()
				.collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
		System.out.println(counts);

		System.out.println(collect);
		System.out.println(counts);
	}

	public static void distinct(String[] strings) {
		List<String> wordsList = Arrays.asList(strings);

		Map<String, Long> collect = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);
	}

	public static void distinctWordSorted(String[] strings) {

		List<String> wordsList = Arrays.asList(strings);
		Map<String, Long> collect = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		LinkedHashMap<String, Long> countByWordSorted = collect.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> {
					throw new IllegalStateException();
				}, LinkedHashMap::new));
		
		System.out.println(countByWordSorted);

	}

}
