package com.atria.day9.Abstraction;

public  abstract class Shape {
	protected float area;
	 abstract void calArea(); // abstract method
	 void show()
	 {
		 System.out.println("this area is"+area);
	 }

}
