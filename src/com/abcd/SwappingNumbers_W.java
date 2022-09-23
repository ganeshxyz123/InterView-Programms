package com.abcd;

public class SwappingNumbers_W {
public static void main(String[] args) {
	
	int a=200;
	int b=500;
	
	System.out.println("Before Swapping");
	System.out.println("a is :" + a);
	System.out.println("b is :" + b);
	
	a=a+b;//700
	b=a-b;//200
	a=a-b;//500
	
	System.out.println("After Swapping a is :" + a);
	System.out.println("After Swapping b is :" + b);
	
}
}
