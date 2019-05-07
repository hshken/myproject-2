package com.java.exception;

import java.io.File;

public class ClassFile {

	public static void main(String[] args) {
		File file = new File("index.txt");
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsoluteFile());
		if( file.exists()==true) {
		System.out.println(file.length());
	}
	}
}
