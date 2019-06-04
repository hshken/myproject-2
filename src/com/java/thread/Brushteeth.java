package com.java.thread;

public class Brushteeth implements Runnable {

@Override
public void run() {
	
		try {
			System.out.println("Brushing teeth");
			Thread.sleep(3000);
			System.out.println("Brushed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
