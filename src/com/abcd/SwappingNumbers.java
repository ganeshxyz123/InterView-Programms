package com.abcd;

public class SwappingNumbers {
public static void main(String[] args) {
	
	int a=1000;
	int b=101;
	
	System.out.println("a is : " + a);
	System.out.println("b is : " + b);
	
int	c=a;//1000
	a=b;//101
	b=c;//1000
	
	System.out.println("after Swapping a is : " + a);
	System.out.println("after Swapping b is : " + b);
	
}
}
