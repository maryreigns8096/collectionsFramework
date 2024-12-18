package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for (int i=1;i<=10;i++) {
			l.add(i);
			
		}
		Iterator i=l.iterator();
		while (i.hasNext()) {
			Integer a=(Integer)i.next();
			if (a%2==0) {
				System.out.println(a);
			}
			else
			{
				i.remove();
			}
		}
				
		
		
	}

}
