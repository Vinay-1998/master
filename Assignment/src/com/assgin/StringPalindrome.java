package com.assgin;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String :");
		String s = sc.next();
		String s1 = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println(s + " Enter String is palindrome " + s1);
		}

		else {
			System.out.println(s + " Enter string is not palindrome " + s1);
		}
	}

}
