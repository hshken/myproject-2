package com.java.exceptionpractice;

import java.util.Scanner;

public class PizzaTester {
	public static void main(String[] args) throws PizzaException {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Pizza想切幾片?");
		Pizza pizza = new Pizza(scanner.nextLine());
		}catch(PizzaException e) {
			
		}
	}
}
