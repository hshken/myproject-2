package com.java.exception;

import java.io.File;

public class ClassFileTester {

	public static void main(String[] args) {
		File dir = new File("C:\\cygwin");
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f : files) {
				if(f.isFile()) {
					System.out.println(f.getName());
				}
			}
			System.out.println();
			
			System.out.println(dir.mkdir());
			File dd = new File(dir,"aa");
			System.out.println(dd.mkdir());
			System.out.println(dd.delete());
		}
		
	}

}
