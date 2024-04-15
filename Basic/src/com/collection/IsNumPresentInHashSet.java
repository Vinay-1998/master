package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IsNumPresentInHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>(Arrays.asList(10,20,30));
		
		int num=2;
		if(hashSet.contains(num))
			System.out.println("present");
		else 
			System.out.println("not");

	}

}
