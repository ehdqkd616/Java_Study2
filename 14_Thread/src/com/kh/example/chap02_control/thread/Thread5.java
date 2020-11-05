package com.kh.example.chap02_control.thread;

public class Thread5 implements Runnable {
	
	// interrupt() : ������ �۾��� ��ҽ�Ű�� �޼ҵ�
	
	// void interrupt()
	//		���� ������ ���ο� interrupted��� �ʵ� ����
	//		true�� �ٲ������ν� �����忡 ���� �۾��� ����϶�� ��û
	
	// boolean isInterrupted()
	//		�������� interrupted�ʵ� �� ��ȯ
	
	// static boolean interrupted()
	//		���� �������� interrupted���¸� ��ȯ�ϰ� false�� ������ �ʱ�ȭ
	
	@Override
	public void run() {
		int count = 0;
		
		while(count < 10) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {
				System.out.println(count + "�ʿ� ī��Ʈ ����");
				// InterruptedException�� �߻��ϸ鼭 interrupted �� ���¸� false�� �ʱ�ȭ
				Thread.currentThread().interrupt();
				break;
			}


		}
	}
}
