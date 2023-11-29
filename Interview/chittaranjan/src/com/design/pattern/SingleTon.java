package com.design.pattern;

import java.io.Serializable;

public class SingleTon implements Serializable,Cloneable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static SingleTon instance = new SingleTon();
private SingleTon() {
	
}

private static SingleTon getInstance() {
	if(instance == null) {
		instance = new SingleTon();
	}
	return instance ;
}
private static SingleTon getInstance2() {
	if(instance == null) {
		synchronized(SingleTon.class) {
			if(instance == null) {
			instance = new SingleTon();
			}
			}
	}
	return instance;
}
protected Object clone() throws CloneNotSupportedException{
	return instance ;
}
protected Object readResolve() {
	return instance ;
}


}
