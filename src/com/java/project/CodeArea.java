package com.java.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CodeArea {

	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();
		ArrayList<String> areacode = new ArrayList<>();
		ArrayList<String> area = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("area code "));
			String line = in.readLine();
			String lastCity="";
			while(line != null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				if(!tokens[0].equals(lastCity)) {
					lastCity = tokens[1];
					city.add(lastCity);
				}
				areacode.add(tokens[0]);
				area.add(tokens[2]);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(city);
	}

}
