package com.wm_practice.utill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Program: Sorting of Employee class with id, Name, Salary
 * 
 * Algorithm
 * 
 * Time Complexity
 * 
 * Auxilary Space 
 */

class Employee implements Comparable<Employee> {

	String id;
	String name;
	Integer salary;

	public Employee(String i, String n, Integer s) {
		id = i;
		name = n;
		salary = s;
	}

	public String toString() {
		return "Employee [Employee id : " + id + ", name : " + name + ". salary: " + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
//		System.out.println(this.id.compareTo(o.id));
//		System.out.println((this.name.compareTo(o.name)));
//		System.out.println((this.salary.compareTo(o.salary)));System.out.println("=======");
//		System.out.println(this.id.compareTo(o.id) + (this.name.compareTo(o.name)) + (this.salary.compareTo(o.salary)));
//;
		return this.id.compareTo(o.id) + (this.name.compareTo(o.name)) + (this.salary.compareTo(o.salary));
	}

}

public class SortEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee("102", "maya", 25000);

		Employee emp2 = new Employee("100", "buvi", 35000);

		Employee emp3 = new Employee("101", "deena", 20000);

		Employee emp4 = new Employee("103", "gayu", 40000);

		List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		Collections.sort(empList);
		System.out.println(empList);

	}
}
