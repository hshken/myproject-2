package com.java.exception;

public class Score {
	int value;
 public Score(int score) throws ScoreFormatException{
	 try {
		value =score; 
	 }catch(NumberFormatException e) {
		 throw new ScoreFormatException();
	 }
	
 }

 }
		

	


