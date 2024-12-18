package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for (int i=1;i<=10;i++) {
			a.add(i);
		}
		Iterator l=a.iterator();
		while(l.hasNext()) {
			Integer i=(Integer)l.next();
		    if (i==6) {
		    	l.remove();
		    }
		    System.out.println(a);
		}
		
	}

}
