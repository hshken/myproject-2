package com.java.thread;

public class Breakfast extends Thread{

	public void run(){
		
		try {
			System.out.println("Making breakfast");
			Thread.sleep(4000);
			System.out.println("breakfast done");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}

