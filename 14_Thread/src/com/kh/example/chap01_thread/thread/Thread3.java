package com.kh.example.chap01_thread.thread;

public class Thread3 extends Thread {
	
	@Override
	public void run() {
		
		setName("사랑스러운 Thread3");
		
		System.out.println(Thread.currentThread().getName() + " ON...");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
