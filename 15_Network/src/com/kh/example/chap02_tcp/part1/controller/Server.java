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
	//		������ Ŭ���̾�Ʈ ���� 1:1 �������(���� ������ ��������)
	//		������ ���� �� ���� ������ Ŭ���̾�Ʈ�� ���� �Ǿ��־�� ��
	//			==> ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ�
	//			==> ����, Ŭ���̞i���� ���α׷��� ���� �����ؾ� ��
	//		������ ���� ������ ����ǰ� ���� ���θ� �Ǵ��Ͽ� �ս� �� ������
	//		UDP���� �ӵ��� ����
	//		
	
	
	
	//		���μ��� �� ��� ���
	//		InputStream/OutputStream ����
	//			�� ��Ʈ���� ���� ���μ��� ���� ���(�����)�� �̷����
	
	public void serverStart() {
		// ������ TCP���� ���α׷��� ����
		// 1. ������ ��Ʈ��ȣ ����
		// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
		// 3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
		// 4. ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
		// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		// 6. ������Ʈ���� ���� ���� ����
		// 7. ��Ʈ���� ���� �а� ����
		// 8. ��� ����
		
		// 1. ������ ��Ʈ ��ȣ ����
		int port = 8500;
		// 0 <= port <= 65535 ���� ����
		// 1023�� ������ ��Ʈ ��ȣ�� �̹� ��� ���� ��Ʈ�� ������ �̿��� ��Ʈ ����
		
		// 2. ServerSocket �����Ͽ� ��Ʈ ����
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
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			// 6. ������Ʈ���� ���� ���� ����
			//		InputStream/OutputStream�� ����Ʈ ����̶�
			//		���� ���·� ����ϱ� ���� ==> ���� ��Ʈ������ ��ȯ
			//								(InputStreamReader)
			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);
			PrintWriter pw = new PrintWriter(output);
			
			// 7. ��Ʈ���� ���� �а� ����
			// Ŭ���̾�Ʈ -> ������ ������ �޼��� �б�
			String message = br.readLine();
			System.out.println(clientIP + "�� ���� �޼��� : " + message);
			// ���� -> Ŭ���̾�Ʈ�� �޼��� ����
			pw.println("������ �ݰ����ϴ�.");
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
