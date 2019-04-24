package com.java.exception;

import java.util.Scanner;

public class Bonus2 {

	public static void main(String[] args) {
		int bonus = 200000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入獲得人數");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			int div = bonus/n;
			System.out.println("每人得"+ div);
		}catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		}catch(NumberFormatException e) {
			System.out.println("數字格式錯誤");
		}

	}

}
