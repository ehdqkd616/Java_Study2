package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	// InetAddress : IP주소를 다루기 위한 클래스
	public static void main(String[] args) {
		// getLocalHost()
		try {
			// getLocalHost() : 로컬호스트의 정보 반환
			InetAddress localIP = InetAddress.getLocalHost();
			// getHostName : 호스트(컴퓨터) 이름 반환
			System.out.println("내 PC명 : " + localIP.getHostName());
			// getHostAddress() : 호스트 IP 반환
			System.out.println("내 IP : " + localIP.getHostAddress());
			
			// getByName(String host) : 도메인 명을 통해 정보 얻음
			InetAddress iei = InetAddress.getByName("www.iei.or.kr");
			System.out.println("iei 서버 명 : " + iei.getHostName());
			System.out.println("iei 서버 IP : " + iei.getHostAddress());
			
			// getAllByName(String host)
			InetAddress[] google = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP개수 : " + google.length);
			System.out.println(google[0].getHostAddress());
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP개수 : " + naver.length);
			
			for(InetAddress ia : naver) {
				System.out.println(ia.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
			
		
		
	}

}
