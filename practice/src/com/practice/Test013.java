package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabfbcdde"; //output=bfbce
		ArrayList<String> ll = new ArrayList<String>(Arrays.asList(str.split("")));
		Set<Integer> hash_Set = new HashSet<Integer>();
		str="";
		

		for(int i=0;i<ll.size();i++) {
			if((i+1) <ll.size() && ll.get(i).equals(ll.get(i+1))) {
				hash_Set.add(i);
				hash_Set.add(i+1);
			}			
		}
		
		System.out.println(hash_Set);
		for(int i=0;i<ll.size();i++) {
			if(!hash_Set.contains(i))
				str+=ll.get(i);
		}
		System.out.println(str);

	}

}
