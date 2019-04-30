package com.java.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		Random random = new Random(66);
		Map <Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i = 0; i<10000; i++) {
			 int r = random.nextInt(20);       
			 Integer freq = m.get(r);    
			 if(freq ==null) {
				 m.put(r, 1);
			 }else {
				  m.put(r, freq+1); 
			 }
			
		}
		System.out.println(m);

	}

}
