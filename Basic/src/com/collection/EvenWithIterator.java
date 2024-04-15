package com.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenWithIterator {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,20,25);
		
		Iterator<Integer> iterator=list.iterator();
		
		while (iterator.hasNext()) {
			int num = (int) iterator.next();
			if(num%2==0)
				System.out.println(num);
			
		}

	}

}
