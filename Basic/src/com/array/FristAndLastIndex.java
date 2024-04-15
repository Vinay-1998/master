package com.array;

public class FristAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,15,20,15,15,20,15};
		int frist=-1, last=-1; 
		int num=15;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				if(frist==-1) {
					frist=i;
				}
				last=i;
			}
		}
		
		System.out.println(frist+" "+last);

	}

}
