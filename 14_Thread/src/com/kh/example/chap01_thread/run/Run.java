package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
//		thread1.run();
//		thread1.start();
		
		System.out.println("------------- main end!");
		
		Thread2 t2 = new Thread2();
//		t2.start();
		
		Thread thread2 = new Thread(t2);
//		thread2.start();
		
		Thread3 thread3 = new Thread3();
//		thread3.start();
		
		// 우선순위 알아보기
		System.out.println("thread1의 우선순위 : " + thread1.getPriority());
		System.out.println("thread2의 우선순위 : " + thread2.getPriority());
		System.out.println("thread3의 우선순위 : " + thread3.getPriority());
		
		// 우선순위 변경하기
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("thread1의 우선순위 : " + thread1.getPriority());
		System.out.println("thread2의 우선순위 : " + thread2.getPriority());
		System.out.println("thread3의 우선순위 : " + thread3.getPriority());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
