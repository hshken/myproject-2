package com.java.Horse;

public class Horse extends Thread {
	 public Horse(String name) {
		 setName(name);
	 }
	 @Override
	public void run() {
		for(int i=1;i<=50 ;i++) {
			StringBuilder spaces = new StringBuilder();
			for(int j=0; j<i ; j++) {
				spaces.append(" ");
			}
			System.out.println( getName()+spaces.toString() +i);
			//為何會一先跑完再跑二
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}


