package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable {
	
	// sleep() : ������ �ð����� �����带 �Ͻ����� ��Ű�� �޼ҵ�
	// �����ð��� �� �ǰų� interrupt()�� ȣ��Ǹ�
	// sleep���� ��� ������ ���°� ��
	// interruptȣ�� �� InterruptException ���ܰ�
	// �߻��ǹǷ� try-catch�� ���� ó���� �� ����
	
	
	
	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("ī��Ʈ ����");
	}
}
