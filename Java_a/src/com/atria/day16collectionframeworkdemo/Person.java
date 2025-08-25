package com.atria.day16collectionframeworkdemo;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		}
	
	void displayinfo() {
		System.out.println("name : " +name +" age: "+age);
	}
	// sort by name
	
	@Override
	public int compareTo(Person other) {
		return other.name.compareTo(this.name);
	}

	

}
