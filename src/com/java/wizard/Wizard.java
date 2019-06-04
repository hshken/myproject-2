package com.java.wizard;

public class Wizard {

	public void thunder() {
		try {
			System.out.println("Making breakfast");
			Thread.sleep(4000);
			System.out.println("breakfast done");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		@Override
		public void run(){
			thunder();
}

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
	}

}
