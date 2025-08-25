package com.atria.day12;

public class Test2 {
	// exception with matching catch block

			public static void main(String[] args) {
				try {
					System.out.println(100/0);
				}
				catch(ArithmeticException e) {
					System.out.println(e.getMessage());
				}
				finally {
					System.out.println("good to see you");
				}
			}
}
