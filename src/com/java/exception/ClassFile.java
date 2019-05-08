package com.java.exception;

import java.io.File;

public class ClassFile {

	public static void main(String[] args) {
		File file = new File("index.txt");
		System.out.println(file.canExecute());
//		可否執行
		System.out.println(file.exists());
//		是否存在
		System.out.println(file.isDirectory());
//		文件路徑是否為目錄
		System.out.println(file.getAbsoluteFile());
//		傳檔案所在位置
		if( file.exists()==true) {
		System.out.println(file.length());
	}
	}
}
