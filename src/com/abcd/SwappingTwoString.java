package com.abcd;

public class SwappingTwoString {
	public static void main(String[] args) {
		
		String a="Chennai";
		String b="super";
		
		System.out.println("Before swapping a is " + a);
		System.out.println("Before swapping b is " + b);
		
		String c=a;
		a=b;
		b=c;
				
		System.out.println("After swapping a is " + a);
		System.out.println("After swapping b is " + b);
	}
}
