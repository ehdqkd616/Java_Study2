package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	// InetAddress : IP�ּҸ� �ٷ�� ���� Ŭ����
	public static void main(String[] args) {
		// getLocalHost()
		try {
			// getLocalHost() : ����ȣ��Ʈ�� ���� ��ȯ
			InetAddress localIP = InetAddress.getLocalHost();
			// getHostName : ȣ��Ʈ(��ǻ��) �̸� ��ȯ
			System.out.println("�� PC�� : " + localIP.getHostName());
			// getHostAddress() : ȣ��Ʈ IP ��ȯ
			System.out.println("�� IP : " + localIP.getHostAddress());
			
			// getByName(String host) : ������ ���� ���� ���� ����
			InetAddress iei = InetAddress.getByName("www.iei.or.kr");
			System.out.println("iei ���� �� : " + iei.getHostName());
			System.out.println("iei ���� IP : " + iei.getHostAddress());
			
			// getAllByName(String host)
			InetAddress[] google = InetAddress.getAllByName("www.google.com");
			System.out.println("���� IP���� : " + google.length);
			System.out.println(google[0].getHostAddress());
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� IP���� : " + naver.length);
			
			for(InetAddress ia : naver) {
				System.out.println(ia.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
			
		
		
	}

}
