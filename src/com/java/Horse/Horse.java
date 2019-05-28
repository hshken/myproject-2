package com.java.Horse;

public class Horse extends Thread {
	 public Horse(String name) {
		 setName(name);
	 }
	public void run() {
		for(int i=1;i<=50 ;i++) {
			System.out.println( getName() +i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
	}


