package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable {
	
	// sleep() : 지정된 시간동안 스레드를 일시정지 시키는 메소드
	// 지정시간이 다 되거나 interrupt()가 호출되면
	// sleep에서 깨어나 실행대기 상태가 됨
	// interrupt호출 시 InterruptException 예외가
	// 발생되므로 try-catch를 통해 처리할 수 있음
	
	
	
	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "초");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("카운트 종료");
	}
}
