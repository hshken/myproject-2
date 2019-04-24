package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		//銷售車輛
				List<String> saleslist = new ArrayList<>();
				saleslist.add("Benz E63");
				saleslist.add("BMW X5");
				saleslist.add("Benz C63");
				saleslist.add("Benz E63");
				System.out.println(saleslist);
				
				//銷售品牌
				Set<String> salesbrand = new HashSet<>();
				salesbrand.add("Benz");
				salesbrand.add("BMW");
				salesbrand.add("Benz");
				salesbrand.add("Benz");
				System.out.println(salesbrand);
				
	}

}
