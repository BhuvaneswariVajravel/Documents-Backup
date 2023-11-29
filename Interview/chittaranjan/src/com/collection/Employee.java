package com.collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee>{
	private Integer id;
	private String name;
	private Double salary ;
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	  public static final Comparator<Employee> emp = new Comparator<Employee>() {
	  public int compare(Employee e1, Employee e2){ Double sal1= e1.getSalary();
	  Double sal2= e2.getSalary(); if(sal1<sal2) { return 1; }else { return
	  sal1>sal2 ? -1:0; } } };
	 
	// public static final Comparator<Employee> emp = (i1, i2) -> -(i1.getSalary().compareTo(i2.getSalary()));
	@Override
	public int compareTo(Employee e1) {
		return this.id-e1.id;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		//TreeSet<Employee> col = new TreeSet<Employee>(Employee.emp);
		List<Employee> col = new LinkedList<Employee>();
		Employee e1 =  new Employee(Integer.valueOf(101),"chittaranjan1",Double.valueOf(120000));
        Employee e2 = new Employee(Integer.valueOf(102),"chittaranjan2",Double.valueOf(20000));
        Employee e3 = new Employee(Integer.valueOf(103),"chittaranjan3",Double.valueOf(180000));
        Employee e4 = new Employee(Integer.valueOf(104),"chittaranjan4",Double.valueOf(130000));
        Employee e5 =new Employee(Integer.valueOf(105),"chittaranjan5",Double.valueOf(10000));
        col.add(e5);
        col.add(e2);
        col.add(e3);
        col.add(e4);
        col.add(e1);
        System.out.println("output::"+col);
        List<Employee> outputs =  col.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        		//col.stream().sorted((o1, o2) ->o2.getSalary().compareTo(o1.getSalary())).collect(Collectors.toList());
        System.out.println("outputjava8::"+outputs);
	}

}
