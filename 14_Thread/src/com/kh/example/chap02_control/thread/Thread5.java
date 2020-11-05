package com.kh.example.chap02_control.thread;

public class Thread5 implements Runnable {
	
	// interrupt() : 스레드 작업을 취소시키는 메소드
	
	// void interrupt()
	//		현재 스레드 내부에 interrupted라는 필드 값을
	//		true로 바꿔줌으로써 스레드에 현재 작업을 취소하라고 요청
	
	// boolean isInterrupted()
	//		스레드의 interrupted필드 값 반환
	
	// static boolean interrupted()
	//		현재 스레드의 interrupted상태를 반환하고 false로 값으로 초기화
	
	@Override
	public void run() {
		int count = 0;
		
		while(count < 10) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {
				System.out.println(count + "초에 카운트 종료");
				// InterruptedException이 발생하면서 interrupted 값 상태를 false로 초기화
				Thread.currentThread().interrupt();
				break;
			}


		}
	}
}
