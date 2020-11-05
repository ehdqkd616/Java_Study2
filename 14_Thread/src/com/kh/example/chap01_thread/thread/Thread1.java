package com.kh.example.chap01_thread.thread;

// ������ ����
// 1. Thread class ��� �ޱ�
public class Thread1 extends Thread {
	
	
	@Override
	public void run() {
		
		setName("�Ϳ��� Thread1");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ON...");
			// getName() : ������ �̸� ��ȯ
			
			try {
				Thread.sleep(500); // ������ ���� �޼ҵ�(1�� = 1000)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
