package com.java.thread;

public class Tester {

	public static void main(String[] args) {
		
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		
		Brushteeth br = new Brushteeth();
		Thread thd = new Thread(br);
		thd.start();
		try {
			breakfast.join();
			thd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main End");
	}

}
