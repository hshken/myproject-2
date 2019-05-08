package com.java.exceptionpractice;

import java.util.Scanner;

import com.java.exception.ScoreFormatException;

public class Pizza {
	
	 public Pizza(String ans) throws PizzaException{
		 int piece;
		 try {
			 piece = Integer.parseInt(ans);
		 }catch(NumberFormatException e) {
			 System.out.println("請輸入數字");
			 throw new PizzaException(ans);
		 }
		 if(piece == 0) {
			System.out.println("你確定不要切?");
		 }if(piece<8 && piece >0 ) {
			 System.out.println("數量錯誤");
		 }if(piece<12 && piece >8 ) {
			 System.out.println("數量錯誤");
		 }if(piece<16 && piece >12 ) {
			 System.out.println("數量錯誤");
		 }if(piece <0 ) {
			 System.out.println("超出範圍");
		 }if(piece==8||piece==12||piece==16) {
			 System.out.println("謝謝惠顧");
		 }
	 }
}
