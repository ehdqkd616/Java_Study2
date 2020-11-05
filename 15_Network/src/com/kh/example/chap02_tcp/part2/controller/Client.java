package com.kh.example.chap02_tcp.part2.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		try {
			// 0. 서버IP, 서버 포트번호
			int port = 8500;
			String serverIP = InetAddress.getLocalHost().getHostAddress();

			// 1. 서버의 IP주소와 서버가 정한 포트 번호를 매개변수로 해서 클라이언트용 소켓객체 생성
			Socket socket = new Socket(serverIP, port); // 연결에 실패할 경우 null반환

			// 서버와 연결이 성공한 경우에만 스트림 오픈
			if (socket != null) {
				// 2. 서버와의 입출력 스트림 오픈
				// 3. 보조스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 1. InputStream input = client.getInputStream();
				// 2. InputStreamReader isr = new InputStreamReader(input);
				// 3. BufferedReader br = new BufferedReader(isr);

				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				// 1. OutputStream output = client.getOutputStream();
				// 2. PrintWriter pw = new PrintWriter(output);

				Scanner sc = new Scanner(System.in);
				do {
					System.out.println("대화 입력 : ");
					String message = sc.nextLine();

					// 4. 스트림을 통해 읽고 쓰기
					pw.println(message);
					pw.flush();

					if (message.equals("exit")) {
						break;
					}

					String serverMsg = br.readLine();
					System.out.println(serverMsg);

				} while (true);

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
