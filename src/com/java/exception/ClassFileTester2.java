package com.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ClassFileTester2 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("aa.txt");
		Reader in = new InputStreamReader(fis);
		int n =in.read();
		//誇號問題 ?問題
		while(n != -1) {
			System.out.print((char)n);
			n =in.read();
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
