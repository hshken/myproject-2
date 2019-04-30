package com.java.exception;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("請輸入英文成績");
			String money = scanner.nextLine();
			System.out.println("請輸入數學成績");
			String number = scanner.nextLine();
		}
	}

}
