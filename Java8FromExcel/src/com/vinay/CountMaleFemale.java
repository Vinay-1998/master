package com.vinay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountMaleFemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=Arrays.asList(
				new Employee(1,"vinay","raikal","Male",2000),
				new Employee(2,"ramya","ds","FeMale",3000),
				new Employee(3,"dhf","as","Male",1000),
				new Employee(4,"vinmmdvay","raikal","feMale",400000)
				);
		
		Map<String, List<Employee>> map=list.stream().collect(Collectors.groupingBy(e->e.getGender().toLowerCase()));
		
		Map<String, Long>m=list.stream().collect(Collectors.groupingBy(e->e.getGender().toLowerCase(), Collectors.counting()));
//		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(e->e.getGender().toUpperCase(),Collectors.counting()));
//		Map<List<Employee>, Long> map=list.stream()
		
		map.forEach((gender,Employee)->{
			System.out.println("  Gender:"+gender+"  count :"+Employee.size());
			Employee.forEach(s->System.out.println(s.getName()));
		});
		System.out.println(map);

		//Find the emp who are belongs to one city
		Map<String, Long> x=list.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
		System.out.println(x);
		
		double increment=0.1;
		System.out.println("---------------------------------------");
		
		list.stream().map(e->new Employee(e.getName() ,e.getSalary()*(1+increment))).forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
	
		System.out.println("--------------------");
		
		list.stream().filter(e->e.getSalary()>=2000).forEach(System.out::println);
	
	
	}

}
