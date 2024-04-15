package com.assgin;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.next();
		System.out.println("enter the sentance :");
		String rev = sc.next();
		
		boolean flage=true;
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<rev.length();j++) {
				if(s.charAt(i)==rev.charAt(j)) {
					flage=true;
				}
				else
				{
					flage=false;
				}
			}
		}
		if(flage=true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
