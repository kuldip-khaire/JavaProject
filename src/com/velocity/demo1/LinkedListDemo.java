package com.velocity.demo1;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach((n) -> System.out.println(n));
		
	}

}
