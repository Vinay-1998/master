package com.array;

public class duplicates {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,10,20,10,20};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
			}
		}

	}

}
