package com.collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumEvenFromList {

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<Integer>(Arrays.asList(10,15,20,25));
		
		Enumeration<Integer> en=vector.elements();
		while (en.hasMoreElements()) {
			Integer integer = (Integer) en.nextElement();
			
			if(integer%2==0) {
				System.out.println(integer);
			}
		}

	}

}
