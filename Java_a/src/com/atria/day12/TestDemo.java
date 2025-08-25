package com.atria.day12;

import java.util.Scanner;

public class TestDemo {
		// to demostarte throw keyword
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the rollnumber:");
		
		int rollno=sc.nextInt();
		
		if(rollno<0) {
			
			throw new ArithmeticException("rollnumber cannot be negative");
			
		}
		else {
			System.out.println("valid rollnumber");
		}
	  }
	}
