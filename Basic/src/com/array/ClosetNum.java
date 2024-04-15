package com.array;

import java.util.Arrays;

public class ClosetNum {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 5, 15, 17, 11, 13 };
		Arrays.sort(arr);

		int n = 11;
		int closetNumIs = closetNum(arr, n);
		System.out.println(closetNumIs);

	}

	public static int closetNum(int[] arr, int n) {
		int closetNumSam = arr[0];
		int mainDiif = Math.abs(arr[0] - n);//5-8=2

		for (int i = 0; i < arr.length; i++) {
			int diff = Math.abs(arr[i] - n);//2,

			if (diff < mainDiif) {
				mainDiif = diff;
				closetNumSam = arr[i];
			}
		}

		return closetNumSam;

	}
}
