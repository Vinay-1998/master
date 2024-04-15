package com.vinay;

public class PrimeNoInRange {

	public static void main(String[] args) {
	
		for(int i=2;i<20;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j!=0) {
					System.out.println(i);
				}
			}
		}

	}

}
