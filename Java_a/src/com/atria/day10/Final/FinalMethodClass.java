package com.atria.day10.Final;

public class FinalMethodClass {

	FinalMethodClass(){
		System.out.println("This is a default constructor.");
	}
	
	final int a=10;
	
	final void show() {
		System.out.println("the value of a: "+a);
	}
	

}