package com.practice;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		//fun("-00000000000 000000 000-23");
		String s="0003187671";
		char [] s1 = s.substring(0, (s.length()/2)).toCharArray();
	    char [] s2 = s.substring((s.length()/2), s.length()).toCharArray();
	    Arrays.sort(s1);
	    Arrays.sort(s2);
	    System.out.println(s1);
	    System.out.println(s2);
	    int sum=0;
	    for(int i=0;i<s1.length;i++){
	        if(s1[i] != s2[i])    
	            sum+=1;
	    }
	    System.out.println(sum);

	}

//	public static void fun(String str) {
//    	 //govinda7
//    	 //0123456789a11
//    	 String c = str.substring(str.length()-1, str.length());
//    	 boolean flag= true;
//    	 int i=1;
//    	 try {
//    		 while(flag) {
//        		 if(c.equals(str.length()-i)) {
//        			 flag=false;
//        			 System.out.println(str.substring(0, str.length()-i));
//        			 System.out.println(c);
//        		 }
//        			 
//        		 else {
//        			 i+=1;
//        			 c=str.substring(str.length()-i, str.length());
//        		 }
//        	 }
//    		 
//    	 }catch(NumberFormatException e) {
//    		 System.out.println("");
//    	 }
//    	
//     }

}
