package com.java.exception;

public class Studentexception {
	
	class pointException extends Exception{
		
	}
	class PPoint{
	   private double point;
	   public void setpoint(double p) throws pointException{
	      if(p<0 || p>100){
	         throw new pointException();
	      }
	      else
	         point=p;
	   }
	   }
	   public static void main(String args[]){
		   PPoint poi=new PPoint();
	   }
}
