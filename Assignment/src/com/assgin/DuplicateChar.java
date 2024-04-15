package com.assgin;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s=sc.nextLine();//ilove hyd
		
		char iterating;
		
		for(int i=0;i<s.length();i++) {
			iterating=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(iterating==(s.charAt(j))) {
					System.out.println(iterating);
					
				}
			}
			
		}
		

	}

}
