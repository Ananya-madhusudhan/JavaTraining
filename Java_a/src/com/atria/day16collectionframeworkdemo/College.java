package com.atria.day16collectionframeworkdemo;

import java.util.Comparator;

//demo for comparator interface

public class College {
	String name;
	int age;
	
	College(String name, int age){
		this.name=name;
		this.age=age;
	}
	void displayinfo() {
		System.out.println("Name "+name +"age "+age);
	}
}

class Namecomparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

class Agecomparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
	
}