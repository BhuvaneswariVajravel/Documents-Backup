package com.wm_practice.utill;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonSerializable implements Serializable {

	private static final long serialVersionUID = 2L;

	private static SingletonSerializable instance;

	private SingletonSerializable() {
		if (instance != null) {
			throw new IllegalStateException("Object cannot be created with reflection");
		}
		System.out.println("Singleton object created");
	}

	public static SingletonSerializable getInstance() {
		if (instance == null) {
			synchronized (SingletonClone.class) {
				if (instance == null) {
					instance = new SingletonSerializable();
				}
			}
		}

		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}

public class SingletonWithSerializable {

	public static void main(String[] args) throws CloneNotSupportedException {
		 try
	        {
			 SingletonSerializable instance1 = SingletonSerializable.getInstance();
	            ObjectOutput out 
	                = new ObjectOutputStream(new FileOutputStream("file.text"));
	            out.writeObject(instance1);
	            out.close();          
	            // deserialize from file to object
	            ObjectInput in 
	                = new ObjectInputStream(new FileInputStream("file.text"));
	            SingletonSerializable instance2 = (SingletonSerializable) in.readObject();
	         in.close();          
	            System.out.println("instance1 hashCode:- "  + instance1.hashCode());
	            System.out.println("instance2 hashCode:- " + instance2.hashCode());
	        }          
	        catch (Exception e)
	        {    e.printStackTrace();        } 
		 

	}

}
