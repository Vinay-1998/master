package com.assgin;

import java.util.Scanner;

public class ReverseStringDes {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.nextLine();

		String[] split = s.split(" ");

		for (int i = split.length-1; i>=0; i--) {
			String rev = " ";
			for (int j = split[i].length()-1; j >= 0; j--) {

				rev = rev + split[i].charAt(j);
			}
			System.out.print(rev);
		}
	}

}
