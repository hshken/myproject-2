package com.java.Horse;

public class Tester {

	public static void main(String[] args) {
		Horse h = new Horse("Horse2: ");
		h.start();
		
		//for(int i=1;i<=5000 ;i++) {
			//System.out.println("Horse1: "+i);
		//}
		HorseRunnable h1 = new HorseRunnable();
		Thread thread = new Thread(h1);
		thread.start();
		 System.out.println("end game");
	}
   
}
