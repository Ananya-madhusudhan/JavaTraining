package com.atria.day11;

public class TaxCalculation {
	 public void calculateTax(Person p) {
	        if (p.getIncome() <= 15000) {
	            p.setTax(0);
	        } else if (p.getIncome() > 15000 && p.getIncome() <= 25000) {
	            p.setTax((p.getIncome() * 5) / 100); // 5% of income
	        } else {
	            p.setTax((p.getIncome() * 10) / 100); // 10% of income
	        }
	    }
}
