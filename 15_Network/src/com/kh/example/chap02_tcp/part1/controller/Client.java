package com.kh.example.chap02_tcp.part1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	// 클라이언트 용 TCP 소켓 프로그래밍 순서
	// 1. 서버의 IP주소와 서버가 정한 포트 번호를 매개변수로 해서 클라이언트용 소켓객체를 생성한다.
	// 2. 서버와의 입출력 스트림 오픈
	// 3. 보조스트림을 통해 성능 개선
	// 4. 스트림을 통해 읽고 쓰기
	// 5. 통신 종료
	
	public void startClient() {
		// 0. 서버IP, 서버 포트번호 알아내기

		try {
			int port = 8500;
//			String serverIP = "192.168.10.245";
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1. 서버의 IP주소와 서버가 정한 포트 번호를 매개변수로 해서 클라이언트용 소켓객체 생성
			Socket socket = new Socket(serverIP, port); // 연결에 실패할 경우 null반환
			
			// 서버와 연결이 성공한 경우에만 스트림 오픈
			if(socket != null) {
				// 2. 서버와의 입출력 스트림 오픈
				// 3. 보조스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4. 스트림을 통해 읽고 쓰기
				// 클라이언트 -> 서버 메세지 전송
				pw.println("반가워요");
				pw.flush();
				
				// 서버 -> 클라이언트 메세지 읽기
				System.out.println(br.readLine());
				
				// 5. 통신 종료
				pw.close();
				br.close();
				socket.close();
			}

			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}


