package com.assgin;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.nextLine();

		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String rev = " ";
			for (int j = split[i].length()-1; j >= 0; j--) {

				rev = rev + split[i].charAt(j);
			}
			System.out.print(rev);
		}
	}

}
