package com.java.exception;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入總獎金");
		String money = scanner.nextLine();
		int m = Integer.parseInt(money);
		System.out.println("請輸入獲得人數");
		String number = scanner.nextLine();
		int n = Integer.parseInt(number);
		int div = m/n;
		System.out.println("每人得"+ div);

	}

}
