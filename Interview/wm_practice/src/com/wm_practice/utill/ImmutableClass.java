package com.wm_practice.utill;

final class Company {

	private String name;
	private int size;

	Company(String name, int size) {

		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

}

class ImmutableClass {
	public static void main(String[] args) {

		Company obj = new Company("Company 1", 10000);

		System.out.println("Name: " + obj.getName());
		System.out.println("Size: " + obj.getSize());
		System.out.println("obj hashcode "+obj.hashCode());
		obj = new Company("Company 2", 20000);

		System.out.println("Name: " + obj.getName());
		System.out.println("Size: " + obj.getSize());
		System.out.println("obj hashcode "+obj.hashCode());

	}
}