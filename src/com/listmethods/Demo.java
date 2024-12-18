package com.listmethods;

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
		List l2=new ArrayList();
		l2.add("mary");
		l2.add("venky");
		l2.add("koti");
		l2.addAll(l);
		System.out.println(l);
		l2.add(1, "reigns");
		System.out.println(l2);
		l2.addAll(1, l);
		System.out.println(l2);
		System.out.println(l2.get(2));
		System.out.println(l2.remove(0));
		l2.set(0, "classic");
		System.out.println(l2);
		String s="maryreigns";
		System.out.println(s.indexOf(2));
		
		
		
		
	}

}
