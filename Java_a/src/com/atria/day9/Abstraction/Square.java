package com.atria.day9.Abstraction;


public class Square extends Shape {
	private float side;
	public Square()
	{
		this.side=2.0f;
	}
	
	void calArea() {
		area=side*side;
	}

}
