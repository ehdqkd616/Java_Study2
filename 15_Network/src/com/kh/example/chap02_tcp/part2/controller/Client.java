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
			// 0. ����IP, ���� ��Ʈ��ȣ
			int port = 8500;
			String serverIP = InetAddress.getLocalHost().getHostAddress();

			// 1. ������ IP�ּҿ� ������ ���� ��Ʈ ��ȣ�� �Ű������� �ؼ� Ŭ���̾�Ʈ�� ���ϰ�ü ����
			Socket socket = new Socket(serverIP, port); // ���ῡ ������ ��� null��ȯ

			// ������ ������ ������ ��쿡�� ��Ʈ�� ����
			if (socket != null) {
				// 2. �������� ����� ��Ʈ�� ����
				// 3. ������Ʈ���� ���� ���� ����
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 1. InputStream input = client.getInputStream();
				// 2. InputStreamReader isr = new InputStreamReader(input);
				// 3. BufferedReader br = new BufferedReader(isr);

				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				// 1. OutputStream output = client.getOutputStream();
				// 2. PrintWriter pw = new PrintWriter(output);

				Scanner sc = new Scanner(System.in);
				do {
					System.out.println("��ȭ �Է� : ");
					String message = sc.nextLine();

					// 4. ��Ʈ���� ���� �а� ����
					pw.println(message);
					pw.flush();

					if (message.equals("exit")) {
						break;
					}

					String serverMsg = br.readLine();
					System.out.println(serverMsg);

				} while (true);

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
