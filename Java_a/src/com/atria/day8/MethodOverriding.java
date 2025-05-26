package com.atria.day8;

public class MethodOverriding {
	
	public static void main(String[] args)
	{
//dynamic binding
		RBI rbi;
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		rbi =new HDFC();
		System.out.println(rbi.getRateOfInterest());
		rbi =new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
}
}
