package com.vinay;

public class Fibno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=0;i<n;i++) {
			System.out.println(Fabano(i)+" ");
		}

	}

	private static int Fabano(int i) {
		if(i<=1)
			return i;
		return Fabano(i-1)+ Fabano(i-2);
	}

}
