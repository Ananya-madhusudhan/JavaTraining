package com.atria.day13;

public class Example {
	// demo for synchronized

	
			synchronized void display() {
				Thread t=Thread.currentThread();
				for(int i=0;i<=3;i++) {
					try {
						Thread.sleep(1000);
						System.out.println(t.getName()+" "+i);
					}
					catch(Exception e) {
						
					}
				}
			}
}
