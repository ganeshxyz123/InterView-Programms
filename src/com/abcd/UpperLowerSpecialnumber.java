package com.abcd;

public class UpperLowerSpecialnumber {
public static void main(String[] args) {
		
	String s = "CheNnaI@600028#";
	
	int upper=0,lower=0,special=0,num=0;
	
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		
		if (Character.isUpperCase(c)) {
			upper++;
		}
		else if (Character.isLowerCase(c)) {
			lower++;
		}
		
		else if (Character.isDigit(c)) {
			num++;
		}
		else {
			special++;
			}
		}	
	System.out.println(upper);
	System.out.println(lower);
	System.out.println(special);
	System.out.println(num);
}
}
