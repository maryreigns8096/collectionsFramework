package com.collectionmethods;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println(l);
		l.remove(0);
		List l2=new ArrayList();
		l2.add("mary");
		l2.add("venky");
		l2.add("koti");
		l2.add("ramesh");
		
		l2.addAll(l);
		System.out.println(l2);
		l2.removeAll(l2);
		System.out.println(l2);
	
	}

}
