package com.abcd;

public class ReverseString {
	public static void main(String[] args) {

		String s = "Chennai";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			char at = s.charAt(i);
			rev = rev + at;
		}
		System.out.println(rev);
	}
}

