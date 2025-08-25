package com.atria.day13;

//demo for multithreading

	public class Extendingthread extends Thread{
		
		public void run() {  // running state
			System.out.println("hello world");
		}
		
	public static void main(String[] args) {
		
		Extendingthread e=new Extendingthread();// new state
		e.start(); // runnable state
		
	}

}
