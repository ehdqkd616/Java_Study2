package com.kh.example.chap01_thread.thread;

// 스레드 생성
// 2. Runnable 인터페이스 구현

public class Thread2 implements Runnable{

	@Override
	public void run() {
		
		Thread.currentThread().setName("멋진 Thread2");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ON...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
