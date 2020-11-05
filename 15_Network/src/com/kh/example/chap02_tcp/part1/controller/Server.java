package com.kh.example.chap02_tcp.part1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	// TCP(Transmission Control Protocol)
	//		서버와 클라이언트 간의 1:1 소켓통신(연결 지향적 프로토콜)
	//		데이터 전송 전 먼저 서버와 클라이언트가 연결 되어있어야 함
	//			==> 서버가 먼저 실행되어 클라이언트의 요청을 기다림
	//			==> 서버, 클라이엍느용 프로그램을 따로 구현해야 함
	//		데이터 전송 순서가 보장되고 수신 여부를 판단하여 손실 시 재전송
	//		UDP보다 속도가 느림
	//		
	
	
	
	//		프로세스 간 통신 담당
	//		InputStream/OutputStream 보유
	//			이 스트림을 통해 프로세스 간의 통신(입출력)이 이루어짐
	
	public void serverStart() {
		// 서버용 TCP소켓 프로그래밍 순서
		// 1. 서버의 포트번호 설정
		// 2. 서버용 소켓 객체 생성 후 포트와 결함
		// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
		// 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		// 5. 연결된 클라이언트와 입출력 스트림 생성
		// 6. 보조스트림을 통해 성능 개선
		// 7. 스트림을 통해 읽고 쓰기
		// 8. 통신 종료
		
		// 1. 서버의 포트 번호 정함
		int port = 8500;
		// 0 <= port <= 65535 지정 가능
		// 1023번 이하의 포트 번호는 이미 사용 중인 포트가 많으니 이외의 포트 지정
		
		// 2. ServerSocket 생성하여 포트 결합
		try {
			// 2. ServerSocket 생성하여 포트 결합
			ServerSocket server = new ServerSocket(port);
			
			// 3. 클라이언트로부터 접속 요청이 올 때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			// 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "가 연결을 요청함...");
			
			// 5. 연결된 클라이언트와 입출력 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			// 6. 보조스트림을 통해 성능 개선
			//		InputStream/OutputStream은 바이트 기반이라서
			//		문자 형태로 통신하기 힘듦 ==> 문자 스트림으로 변환
			//								(InputStreamReader)
			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);
			PrintWriter pw = new PrintWriter(output);
			
			// 7. 스트림을 통해 읽고 쓰기
			// 클라이언트 -> 서버로 전송한 메세지 읽기
			String message = br.readLine();
			System.out.println(clientIP + "가 보낸 메세지 : " + message);
			// 서버 -> 클라이언트로 메세지 전송
			pw.println("만나서 반갑습니다.");
//			Scanner sc = new Scanner(System.in);
//			String s = sc.nextLine();
//			pw.print(s);
			
			pw.flush();
			
			pw.close();
			br.close();
			output.close();
			input.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
