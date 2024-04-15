package com.assgin;

import java.util.Scanner;

public class NoWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.nextLine();
		
		String[] a=s.split(" ");
		
		System.out.println(a.length);

	}

}
