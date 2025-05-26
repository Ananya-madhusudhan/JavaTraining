package com.atria.day1;

public class TypecastingDemo {

	public static void main(String[] args) {
		// implicit
		byte b=10; //convert byte to int, widening method
		int i=b;
		System.out.println(i);

		//explicit typrcasting
		float f2=35.42f;    //norrowing
		int f1=(int)f2;
		System.out.println(f1);
	}

}
