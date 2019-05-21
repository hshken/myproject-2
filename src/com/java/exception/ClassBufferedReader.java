package com.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ClassBufferedReader {

	public static void main(String[] args) throws IOException {
		 
		try {
			FileInputStream	fis = new FileInputStream("aa.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line != null) {
				System.out.println(line);
				String[] tokens = line.split(" ");
				if(tokens.length ==2) {
					System.out.println(tokens[0]+ "/"+tokens[1] );
					int n =Integer.parseInt(tokens[1]);
					if(n>10) {
						System.out.println(tokens[0]+ " "+(n-10)*1000 );
					}
				}
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
