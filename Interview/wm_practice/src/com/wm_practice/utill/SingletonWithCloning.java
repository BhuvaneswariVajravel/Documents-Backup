package com.wm_practice.utill;

class SingletonClone implements Cloneable {

	private static final long serialVersionUID = 1L;

	private static SingletonClone instance;

	private SingletonClone() {
		if (instance != null) {
			throw new IllegalStateException("Object cannot be created with reflection");
		}
		System.out.println("Singleton object created");
	}

	public static SingletonClone getInstance() {
		if (instance == null) {
			synchronized (SingletonClone.class) {
				if (instance == null) {
					instance = new SingletonClone();
				}
			}
		}

		return instance;
	}

	@Override
	protected Object clone() {
		System.out.println("====trying to clone=== ");
		return instance;
	}
}

public class SingletonWithCloning {

	public static void main(String[] args) {
		SingletonClone instance1 = SingletonClone.getInstance();

		System.out.println("instance1 hashCode:- " + instance1.hashCode());

		// cloning
		SingletonClone instance2 = (SingletonClone) instance1.clone();
		System.out.println("instance2 hashCode:- " + instance2.hashCode());
	}

}
