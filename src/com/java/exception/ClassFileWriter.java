package com.java.exception;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class ClassFileWriter {

	public static void main(String[] args) throws Exception{
//		FileOutputStream fos = new FileOutputStream("index.txt");
//		fos.write(6);
//		fos.write(66);
		OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream("index.txt"),"utf-8");
		fos.write(0x52C7);
		fos.write(0x58EB);
		fos.write(0x51A0);
		fos.write(0x8ECD);
		//fos.write(66);
//		fos.write(66);
//		fos.write(66);
//		fos.flush();
		fos.close();
		
	}

}
