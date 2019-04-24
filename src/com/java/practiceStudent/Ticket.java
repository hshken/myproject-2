package com.java.practiceStudent;

public class Ticket {
	String time;
	 String name;
	protected String fromdepart;
	private int price;
	public Ticket(String time, String name, String fromdepart,int price) {
		this.name=name;
		this.fromdepart=fromdepart;
		this.time= time;
		this.price=price;
	}
	public void print() {
		System.out.println(time+"\t"+fromdepart+"\t"+name+"\t"+price);
	}
	public void setprice(int price){
		if(price>=0 &&price<=300) {
			this.price=price;
		}
	}
}
