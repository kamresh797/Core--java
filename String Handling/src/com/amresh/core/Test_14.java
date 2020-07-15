/*	split the string into tokens
 			[public String[] split(String delim) ]
 */

package com.amresh.core;

import java.util.Arrays;

public class Test_14 {
	public static void main(String[] args) {
		
		String s1="Amresh NIT";
		System.out.println(s1);
		
		String[] sa1=s1.split(" ");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		
		String[] sa2=s1.split("a");
		System.out.println(sa2.length);
		System.out.println(Arrays.toString(sa2));
		
		String[] sa3=s1.split("b");
		System.out.println(sa3.length);
		System.out.println(Arrays.toString(sa3));
		
		String[] sa4=s1.split("A");
		System.out.println(sa4.length);
		System.out.println(Arrays.toString(sa4));
		
		String[] sa5=s1.split("H");
		System.out.println(sa5.length);
		System.out.println(Arrays.toString(sa5));
		
		String[] sa6=s1.split("a");
		System.out.println(sa6.length);
		System.out.println(Arrays.toString(sa6));
		
		
		s1="abc abc abc";
		
		String[] sa7 =s1.split("c");
		System.out.println(sa7.length);
		System.out.println(Arrays.toString(sa7));
		
		String[] sa8=s1.split("a");
		System.out.println(sa8.length);
		System.out.println(Arrays.toString(sa8));
	
		String[] sa9=s1.split("abc");
		System.out.println(sa9.length);
		System.out.println(Arrays.toString(sa9));
	
		String[] sa10=s1.split("abc abc abc");
		System.out.println(sa10.length);
		System.out.println(Arrays.toString(sa10));
	
		s1="abc.txt";
		
		String[] sa11=s1.split(".");
		System.out.println(sa11.length);
		System.out.println(Arrays.toString(sa11));
		System.out.println();
		
		String[] sa12=s1.split("\\.");
		System.out.println(sa12.length);
		System.out.println(Arrays.toString(sa12));
		System.out.println();
		
		String[] sa13=s1.split("");
		System.out.println(sa13.length);
		System.out.println(Arrays.toString(sa13));
		System.out.println();
		
		String s2="aa";
		String[] sa14=s2.split("a");
		System.out.println(sa14.length);
		System.out.println(Arrays.toString(sa14));
		System.out.println();
		
		String s3="aabc aabc";
		String[] sa15=s3.split("a");
		System.out.println(sa15.length);
		System.out.println(Arrays.toString(sa15));
		System.out.println();
	
	
	
	
	
	
	
	
	}
}
