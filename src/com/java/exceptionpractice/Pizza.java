package com.java.exceptionpractice;

import java.util.Scanner;

import com.java.exception.ScoreFormatException;

public class Pizza {
	int piece;
	 public Pizza(int piece) throws PizzaException{
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
	 }
}
