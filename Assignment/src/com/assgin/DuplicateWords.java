package com.assgin;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.nextLine();
		

		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					System.out.print(split[i]);

				}
			}
		}

	}

}
