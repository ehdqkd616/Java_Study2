package com.kh.example.chap02_tcp.part1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	// Ŭ���̾�Ʈ �� TCP ���� ���α׷��� ����
	// 1. ������ IP�ּҿ� ������ ���� ��Ʈ ��ȣ�� �Ű������� �ؼ� Ŭ���̾�Ʈ�� ���ϰ�ü�� �����Ѵ�.
	// 2. �������� ����� ��Ʈ�� ����
	// 3. ������Ʈ���� ���� ���� ����
	// 4. ��Ʈ���� ���� �а� ����
	// 5. ��� ����
	
	public void startClient() {
		// 0. ����IP, ���� ��Ʈ��ȣ �˾Ƴ���

		try {
			int port = 8500;
//			String serverIP = "192.168.10.245";
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1. ������ IP�ּҿ� ������ ���� ��Ʈ ��ȣ�� �Ű������� �ؼ� Ŭ���̾�Ʈ�� ���ϰ�ü ����
			Socket socket = new Socket(serverIP, port); // ���ῡ ������ ��� null��ȯ
			
			// ������ ������ ������ ��쿡�� ��Ʈ�� ����
			if(socket != null) {
				// 2. �������� ����� ��Ʈ�� ����
				// 3. ������Ʈ���� ���� ���� ����
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4. ��Ʈ���� ���� �а� ����
				// Ŭ���̾�Ʈ -> ���� �޼��� ����
				pw.println("�ݰ�����");
				pw.flush();
				
				// ���� -> Ŭ���̾�Ʈ �޼��� �б�
				System.out.println(br.readLine());
				
				// 5. ��� ����
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


