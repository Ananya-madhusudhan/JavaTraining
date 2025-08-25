package com.atria.day16collectionframeworkdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maindemo {
public static void main(String[] args) {
	List<College> p=new ArrayList<>();
	
	p.add(new College("Ananya",21));
	p.add(new College("Drishya",20));
	p.add(new College("Madhu",17));
	
	// sort by name
	Collections.sort(p, new Namecomparator());
	System.out.println("sorted by name");
	for(College c:p) {
	c.displayinfo();
	}
	// sort by age
	
	Collections.sort(p, new Agecomparator());
	System.out.println("sorted by age");
	for(College c:p) {
	c.displayinfo();
	}
}
}
