package com.kh.example.chap01_thread.thread;

// 스레드 생성
// 1. Thread class 상속 받기
public class Thread1 extends Thread {
	
	
	@Override
	public void run() {
		
		setName("귀여운 Thread1");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ON...");
			// getName() : 스레드 이름 반환
			
			try {
				Thread.sleep(500); // 스레드 지연 메소드(1초 = 1000)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
