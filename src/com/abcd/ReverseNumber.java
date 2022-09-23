package com.abcd;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 21407;
		int i = 0, j = 0;
		while (num > 0) {
			i =num % 10;
			j =(j*10) + i;
			num = num / 10;
		}
		System.out.println(j);
	}
}


