package com.java.wizard;

public class Wizard extends Thread {

	public void thunder() {
		System.out.println("Thunder start");
		try {
			Thread.sleep(4000);
			
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thunder done");
	}
		@Override
		public void run(){
			thunder();
}

	

}
