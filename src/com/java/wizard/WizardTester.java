package com.java.wizard;

public class WizardTester {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		try {
			//等w1執行完，再執行w2
			w1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		w2.start();
	}
}
