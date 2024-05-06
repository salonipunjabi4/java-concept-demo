package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<5; i++) {
			queue.add(i);
		}
		
		System.out.println(queue);
		System.out.println("=============");
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.peek()); //retrieves top element from the queue
		System.out.println("=============");
		System.out.println(queue);
		System.out.println("=============");
		System.out.println(queue.poll());//retrieved top element from queue and removes too
		System.out.println("=============");
		System.out.println(queue);

	}

}
