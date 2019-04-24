package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListandSet {

	public static void main(String[] args) {
		//List 會按造輸入順序排列  可重複
				List<Integer> list = new ArrayList<>();
				list.add(6);
				list.add(100);
				list.add(6);
				list.add(7);
				System.out.println(list);
				
				List<String> list2 = new ArrayList<>();
				list2.add("Ken");
				System.out.println(list2);
				
				
				//Set 會按造大小排列  不重覆
				Set<Integer> set = new HashSet<>();
				set.add(9);
				set.add(77);
				set.add(9);
				set.add(3);
				System.out.println(set);
				

	}

}
