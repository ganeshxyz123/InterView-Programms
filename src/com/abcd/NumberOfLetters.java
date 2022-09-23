package com.abcd;

public class NumberOfLetters {
	public static void main(String[] args) {

		String s = "demo";

		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {

				char c = s.charAt(i);

				System.out.println(c);
			}
		}
	}

}