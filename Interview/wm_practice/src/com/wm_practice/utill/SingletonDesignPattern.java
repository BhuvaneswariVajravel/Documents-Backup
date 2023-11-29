package com.wm_practice.utill;

class Singleton {
	private static Singleton singleton = null;

	public String s;

	private Singleton() {
		s = "Single oblject created";
	}

	public static Singleton getSingleton() {
			if (singleton == null) {
				singleton = new Singleton();
			}
		
		return singleton;
	}
}

class SingletonDesignPattern {
	public static void main(String args[]) {
		Singleton x = Singleton.getSingleton();

		Singleton y = Singleton.getSingleton();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("\n");

		x.s = (x.s).toUpperCase();

		y.s = (y.s).toLowerCase();

		System.out.println("lower case string x is " + x.s);
		System.out.println("lower case string y is " + y.s);
	}
}
