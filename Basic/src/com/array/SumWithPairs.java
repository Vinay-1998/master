package com.array;

public class SumWithPairs {

	public static void main(String[] args) {
		int arr[]={ 10, 20, 5, 15, 17, 11, 13 };

		int num=30;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					System.out.println("arr["+i+"] arr["+j+"]");
				}
			}
		}
	}

}
