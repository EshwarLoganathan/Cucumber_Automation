package com.program;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "vaishnavi";

		String temp = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char value = s.charAt(i);
			temp = temp + value;
		}
		String Upper = temp.toUpperCase();
		String Lower = temp.toLowerCase();
		System.out.println("The Reverse String is " + temp);
		System.out.println("The Upper Case is " + Upper);
		System.out.println("The Lower Case is "+Lower);
	}
}
