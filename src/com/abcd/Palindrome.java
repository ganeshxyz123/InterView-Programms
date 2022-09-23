package com.abcd;

public class Palindrome {
public static void main(String[] args) {

	String s = "MOM";
	String rev="";
		
	for (int  i= s.length()-1 ; i>=0; i--) {
		
		char l = s.charAt(i);
		rev = rev + l;
	}
		if (rev.equals(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
}
}
