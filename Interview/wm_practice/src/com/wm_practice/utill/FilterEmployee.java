package com.wm_practice.utill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee1 {
	private String name;
	private Integer salary;
	private String dept;

	public Employee1(String name, Integer salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Salary: " + salary + ", Dept: " + dept;
	}

}

public class FilterEmployee {

	public static void printList() {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		System.out.println("original list: " + numbers);

		numbers.stream().map(s -> Integer.valueOf(s)).filter(number -> number % 2 == 0).forEach(System.out::println);

	}

	public static void main(String[] args) {
		List<Employee1> emp = new ArrayList<>();
		emp.add(new Employee1("emp1", 10000, "HR"));
		emp.add(new Employee1("emp2", 50000, "HR"));
		emp.add(new Employee1("emp3", 70000, "Development"));
		emp.add(new Employee1("emp4", 100000, "Developement"));
		emp.add(new Employee1("emp5", 8000, "Testing"));

		emp.stream().map(e -> 
	    {
	        e.setSalary(e.getSalary()+10000);
	          return e;
	      }).filter(i -> i.getSalary() > 50000).forEach(System.out::println);

		printList();
	}
}
