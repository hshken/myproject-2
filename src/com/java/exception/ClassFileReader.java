package com.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClassFileReader {

	public static void main(String[] args) {
		int n = Integer.parseInt("6");
		try {
		FileReader fr = new FileReader("index.txt");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		}
	}

}
