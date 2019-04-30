package com.java.exception;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("請輸入英文成績");
			Score english = new Score(scanner.nextLine());
			System.out.println("請輸入數學成績");
			Score math = new Score(scanner.nextLine());
			System.out.println("平均"+ (english.value +math.value)/2);
			}catch(ArithmeticException e) {
				System.out.println("數值運算錯誤");
			}catch(NumberFormatException e) {
				//e.printStackTrace();開發者用
				System.out.println("數字格式錯誤");
			}catch(ScoreFormatException e) {
				System.out.println("請輸入0-100的數字");
		}
	}

}
