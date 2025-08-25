	package com.atria.day11;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the name:");
	        String name = sc.nextLine();
	        
	        System.out.println("Enter the income:");
	        int income = sc.nextInt();
	        
	        Person p = new Person();
	        p.setName(name);
	        p.setIncome(income);
	        
	        TaxCalculation c = new TaxCalculation();
	        c.calculateTax(p);
	        
	        System.out.println(p);
	    }

}
