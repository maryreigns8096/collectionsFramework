package com.collectionmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List l3=new ArrayList();
		
		System.out.println(l3.isEmpty());
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		
		
		//l.remove(1);
		//System.out.println(l);
		List l2=new ArrayList();
		l2.add("mary");
		l2.add("venky");
		l2.add("kanaka");
		l2.add("koti");
		l2.addAll(l);
		System.out.println(l2);
		//l2.removeAll(l);
		//System.out.println(l2);
		//l2.retainAll(l);
		//System.out.println(l2);
		//l2.clear();
		//System.out.println(l2);
		//l2.contains(10);
		//System.out.println(l2);
		//System.out.println(l2.contains(10));
		//System.out.println(l2);
		//System.out.println(l2.containsAll(l));
		//System.out.println(l2);
		System.out.println(l.size());
		 Object []a=l.toArray();
				
		
		
	}

}
