package com.design.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imutable {
private final int id;
private final int age;
private final String name;
private List<String> address ;
public Imutable(int id,int age, String name,List<String> address) {
this.id=id;
this.age=age;
this.name=name;
List<String> add= address.stream().collect(Collectors.toList());
this.address = add;
}
public List<String> getAddress() {
	List<String> add= address.stream().collect(Collectors.toList());
	return add;
}

public int getId() {
	return id;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
public static void main(String args[]) {
	
    List<String> address = new ArrayList<>();
    address.add("blr,karnataka,pin:560102");
    Imutable imutable = new Imutable(105,33,"chittaranjan",address);
    System.out.println("imutable:" +imutable.getAge()+":"+imutable.getName()+":"+imutable.getAddress());
    address.add("test1,test2,pin:560102");
    System.out.println("imutable:" +imutable.getAge()+":"+imutable.getName()+":"+imutable.getAddress());
    String str="This1234#string%contains^special*characters&.";

    str=str.replaceAll("[^a-zA-Z0-9]"," ");
    System.out.println(str);
}

}
