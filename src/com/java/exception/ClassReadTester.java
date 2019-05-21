package com.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassReadTester {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("result.txt");
			int n = fis.read();
		while(n != -1) {
				System.out.println((char)n);
				n = fis.read();
				
	}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		

	}

}
