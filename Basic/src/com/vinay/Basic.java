package com.vinay;

public class Basic {

	public static void main(String[] args) {
		
		int num=9;
		
		if(num%2 ==0)
			System.out.println("even");
		else 
			System.out.println("odd");
		
		for(int i=0;i<15;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		int i=10;
		System.out.println("Before swap" +num);
		System.out.println("Before swap" +i);
		i=i*num;//90
		num=i/num; //90/9 =10
		i=i/num;//90/10=9
		System.out.println("After swap" +num);
		System.out.println("After swap" +i);
		
		int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci Series:");
        for (int j = 0; j < n; j++) {
            System.out.print(fibonacci(j) + " ");
		
	}
	}
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
}
