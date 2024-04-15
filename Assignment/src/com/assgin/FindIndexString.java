package com.assgin;

import java.util.Scanner;

public class FindIndexString {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.nextLine();

		int count = 0;
		int frist = 0;
		int last = 0;

		System.out.println("enter char");
		char ch = sc.next().charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				if (count == 0) {
					frist = frist + i;
					count++;
				}

				else {
					last = last + i;
				}
			}
		}
		System.out.println(last - frist);

	}

}
