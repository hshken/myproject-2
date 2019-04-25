package com.java.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.java.exception.Studentexception.pointException;

public class Student {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入英文成績");
		String money = scanner.nextLine();
		System.out.println("請輸入數學成績");
		String number = scanner.nextLine();
		try {
		int m = Integer.parseInt(money);
		int n = Integer.parseInt(number);
		int div = (m+n)/2;
		System.out.println("平均"+ div);
		}catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		}catch(NumberFormatException e) {
			System.out.println("數字格式錯誤");
		}catch(pointException e) {
			System.out.println("錯誤，請輸入0-100之間");
		}

	}

}
