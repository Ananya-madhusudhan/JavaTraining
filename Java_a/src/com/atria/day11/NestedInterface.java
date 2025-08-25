package com.atria.day11;

public class NestedInterface implements  MyInterface.myinnerinterface{
	
	  @Override
	    public void point() {
	        System.out.println("Welcome");
	        System.out.println("id value: " + id);
	    }
}
