package com.velocity.demo1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kshitija");
		list.add("Kuldip");
		list.add("Amit");
		
		list.forEach((n)-> System.out.println(n));

	}

}
