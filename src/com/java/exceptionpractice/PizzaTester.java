package com.java.exceptionpractice;

import java.util.Scanner;

public class PizzaTester {
	public static void main(String[] args) throws PizzaException {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Pizza想切幾片?");
		int piece = scanner.nextInt();
		 if(piece == 0) {
			 throw new PizzaException("你確定不要切?");
		 }else {
			System.out.println("");
			
		 }if(piece<8 && piece >0 ) {
			 throw new PizzaException("數量錯誤");
		 }else {
			 System.out.println("");
		 }if(piece<12 && piece >8 ) {
			 throw new PizzaException("數量錯誤");
		 }else {
			 System.out.println("");
		 }if(piece<16 && piece >12 ) {
			 throw new PizzaException("數量錯誤");
		 }else {
			 System.out.println("");
		 }if(piece <0 ) {
			 throw new PizzaException("超出範圍");
		 }else {
			 System.out.println("");
		 }
		System.out.println("謝謝惠顧");
		}catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		}catch(NumberFormatException e) {
			System.out.println("數字格式錯誤");

		}catch(PizzaException e) {
			System.out.println(e.getMessage());
		}
	}
}
