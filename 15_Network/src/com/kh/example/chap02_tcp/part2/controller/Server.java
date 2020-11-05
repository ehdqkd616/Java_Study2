package com.kh.example.chap02_tcp.part2.controller;

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
	public void serverStart() {
		// 1. ��Ʈ ��ȣ ����
		int port = 8500;

		try {
			// 2. ServerSocket �����Ͽ� ��Ʈ ����
			ServerSocket server = new ServerSocket(port);
			
			// 3. Ŭ���̾�Ʈ�κ��� ���� ��û�� �� ������ ���
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�.");
			
			// 4. ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��...");
			
			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			// 6. ������Ʈ���� ���� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 1. InputStream input = client.getInputStream();
			// 2. InputStreamReader isr = new InputStreamReader(input);
			// 3. BufferedReader br = new BufferedReader(isr);
			
			PrintWriter pw = new PrintWriter(client.getOutputStream());			
			// 1. OutputStream output = client.getOutputStream();
			// 2. PrintWriter pw = new PrintWriter(output);

			// 7. ��Ʈ���� ���� �а� ����
			while(true) {
				String message = br.readLine();
				
				if(!message.equals("exil")) {
					System.out.println(clientIP + "�� ���� �޼��� : " + message);
					pw.println("�޼��� �ޱ� ����");
					pw.flush();
				} else {
					System.out.println("���� ����");
					break;
				}
			}
			
			// 8. ��� ����
			br.close();
			pw.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
