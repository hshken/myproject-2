package com.java.exception;

public class Studentexception {
	
	class pointException extends Exception{
		
	}
	class PPoint{
	   public double point;
	   public void setpoint(double p) throws pointException{
	      if(p<0 || p>100){
	         throw new pointException();
	      }
	    }
	 }public static void main (String[] args) {
	}
}
