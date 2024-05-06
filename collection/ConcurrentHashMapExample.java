package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> coMap = new ConcurrentHashMap<>();
		coMap.put("abc","Hello");
		coMap.put("xyz", "Welcome");
		coMap.put("pqr", "How are you");
		
		Iterator<String> itr = coMap.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			if(key.equals("abc")) {
				coMap.remove(key);
			}
		}
		System.out.println("Concurrent hasmap= "+ coMap);

	}

}
