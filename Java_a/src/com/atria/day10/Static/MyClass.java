package com.atria.day10.Static;

public class MyClass {
	
	private int section;
	private static int srNo;
	
	static {
		
		System.out.println("----------Within Static Block----------");
		srNo=1000;
		
	}
	
	MyClass(){
		System.out.println("----------Within default constructor----------");
		srNo++;
		section++;
	}
	
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}

	//static method
	static void display() 
	{
	//	System.out.println("Section : "+section); //can't access non static members	
		System.out.println("Serial No. "+srNo); 
	}

}
