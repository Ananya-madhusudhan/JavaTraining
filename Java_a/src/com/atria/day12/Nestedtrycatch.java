package com.atria.day12;

public class Nestedtrycatch {

public static void check() {
	String str="TNS";
	int slength=str.length();
	System.out.println("string length "+slength);
	
	String anotherstring=null;
	
	int y=6;
	try {
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("string length"+anotherstring.length());
	}
	catch(NullPointerException t) {
		System.out.println(t.getMessage());
	}
}
public static void main(String[] args) {
	Nestedtrycatch.check();
}
}
