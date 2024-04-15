package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfString {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("banana");
		stringList.add("apple");
		stringList.add("orange");
		stringList.add("grape");

		// Sort the list of strings
		Collections.sort(stringList);
		System.out.println("Sorted list of strings:");
		System.out.println(stringList);

		// Compare strings
		String str1 = "apple";
		String str2 = "banana";
		int comparison = str1.compareTo(str2);
		System.out.println(comparison);
		if (comparison < 0) {
			System.out.println(str1 + " comes before " + str2);
		} else if (comparison > 0) {
			System.out.println(str1 + " comes after " + str2);
		} else {
			System.out.println(str1 + " is equal to " + str2);
		}

	}

}
