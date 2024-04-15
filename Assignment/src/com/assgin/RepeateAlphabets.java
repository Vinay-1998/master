package com.assgin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeateAlphabets {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.next();
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char c;
		for (int i = 0; i < s.length(); i++) {
			for (c = 'A'; c <= 'Z'; ++c) {
				// System.out.print(c + " ");
				for (int j = 0; j < s.length(); j++) {
					if (c == s.charAt(j)) {
						count++;
					}
				}
				map.put(c, count);
			}
			System.out.println(map);
			count = 0;

		}
	}

}
