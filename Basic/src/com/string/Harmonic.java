package com.string;

public class Harmonic {

	public static void main(String[] args) {
		int n=10;
		System.out.println(harmonicSum(n));

	}

	public static double harmonicSum(int n) {
		  double sum = 0.0;
		  for (int i = 1; i <= n; i++) {
		    sum += 1.0 / i;
		  }
		  return sum;
		}
}
//2.9289682539682538