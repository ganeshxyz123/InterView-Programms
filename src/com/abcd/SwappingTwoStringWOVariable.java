package com.abcd;

public class SwappingTwoStringWOVariable {
	public static void main(String[] args) {
		String a = "company";
		String b = "client";
		int sizea = a.length();
		a=a.concat(b);
		b=a.substring(0,sizea);
		a=a.substring(sizea);
		
		System.out.println("After Swapping a is " +a);
		System.out.println("After Swapping b is " +b);
		
	}
}
  