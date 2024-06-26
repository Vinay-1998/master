package com.vinay;

public class Employee {
	private int id;

	private String name;

	private String city;

	private String gender;
	
	private double salary;
	

	public Employee(int id, String name, String city, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.salary = salary;
	}
	
	

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", gender=" + gender + ", salary=" + salary
				+ "]";
	}
	

	

}
