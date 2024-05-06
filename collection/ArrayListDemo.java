package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add(123);
		list.add(123);
		list.add(null);
		list.add("Hello");
		list.add(345.8);
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.contains("Hello"));
		System.out.println(list.size());
		
		
		System.out.println("===========");
		Collections.synchronizedList(list);
		Iterator iterator = list.iterator()
;
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(list);
		System.out.println("===========");
		
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("===========");
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.nextIndex());
		System.out.println(listIterator.previousIndex());
		System.out.println(listIterator.previous());
		
	}

}
