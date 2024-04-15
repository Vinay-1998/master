package com.vinay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntegersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(10,20,10,15,17,20,17);
		
		Map<Integer, Long> map= list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		map.forEach((n,occurence)->System.out.println(n));
		System.out.println(map);
		System.out.println("-------------------------");

		list.stream().filter(n->n%2==0).forEach(System.out::println);
		System.out.println("-------------------------");
		List<Integer> lis=list.stream().map(Object::toString).filter(s->s.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(lis);
	
	}

}
