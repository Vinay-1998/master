package com.assgin;

import java.util.Scanner;

public class Novowles {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentance :");
		String s = sc.next();
		
		int vcount=0;
		int ccount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='s' ) {
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		
		System.out.println("no vowles : "+vcount);
		System.out.println("no consonent :"+ccount);

	}

}
