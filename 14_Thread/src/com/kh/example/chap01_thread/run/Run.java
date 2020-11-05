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
		
		// �켱���� �˾ƺ���
		System.out.println("thread1�� �켱���� : " + thread1.getPriority());
		System.out.println("thread2�� �켱���� : " + thread2.getPriority());
		System.out.println("thread3�� �켱���� : " + thread3.getPriority());
		
		// �켱���� �����ϱ�
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("thread1�� �켱���� : " + thread1.getPriority());
		System.out.println("thread2�� �켱���� : " + thread2.getPriority());
		System.out.println("thread3�� �켱���� : " + thread3.getPriority());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
