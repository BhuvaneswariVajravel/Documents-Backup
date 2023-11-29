package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee8
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee8(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
    public static void main(String[] args) {
    	List<Employee8> employee8List = new ArrayList<>();
        
    	employee8List.add(new Employee8(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
    	employee8List.add(new Employee8(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
    	employee8List.add(new Employee8(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
    	employee8List.add(new Employee8(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
    	employee8List.add(new Employee8(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
    	employee8List.add(new Employee8(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
    	employee8List.add(new Employee8(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
    	employee8List.add(new Employee8(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
    	employee8List.add(new Employee8(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
    	employee8List.add(new Employee8(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
    	employee8List.add(new Employee8(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
    	employee8List.add(new Employee8(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
    	employee8List.add(new Employee8(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
    	employee8List.add(new Employee8(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
    	employee8List.add(new Employee8(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
    	employee8List.add(new Employee8(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
    	employee8List.add(new Employee8(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    	
    	Employee8 highestPaidEmployeeWrapper=
    			employee8List.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee8::getSalary))).get();
    	DoubleSummaryStatistics employeeSalaryStatistics=
    			employee8List.stream().collect(Collectors.summarizingDouble(Employee8::getSalary));
    			         
    			System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
    			         
    			System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
    		
	}
    
}