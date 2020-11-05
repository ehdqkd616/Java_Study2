package TCP_MultiChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiClientThread2 extends Thread {

	Socket socket = null;
	BufferedReader stdin; // ǥ���Է°�ü(Ű����)
	BufferedWriter bw = null; // ������ ����
	BufferedReader br = null; // ������ �б�
	// PrintWriter pw = null;

	// String strId = "";

	public MultiClientThread2(Socket tmpSocket) {
		socket = tmpSocket;

		try {
			//////////////////////////////////////////////////////////////////////////
			// 1. ��/��� ��ä ����
			//////////////////////////////////////////////////////////////////////////
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// pw = new PrintWriter(socket.getOutputStream());
			//////////////////////////////////////////////////////////////////////////
		} catch (IOException e) {
			System.out.println("MultiClientThread2 ��Ʈ�� ���� ����");
		}
	}

	public void run() {
		try {
			String msg = "";

			while (!msg.equals("bye")) {
				////////////////////////////////////
				// 1. Client �� �Է��� ���� �� ���
				////////////////////////////////////
				msg = br.readLine();
				System.out.println(msg);
				////////////////////////////////////
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("MultiClientThread2 run() ���� �߻�");
		} finally {
			try {
				br.close();
				bw.close();
				// pw.close();
				socket.close();
			} catch (Exception e) {
			}
		}
	}

	// ä��
	public void chatProcess() {
		try {
			String msg = "";
			while (!msg.equals("bye")) {
				System.out.println("�޼����� �Է��Ͻÿ� : ");
				msg = stdin.readLine();

				// msg = msg + System.getProperty("line.separator");
				bw.write(msg + "\n");
				bw.flush();

				// pw.println(msg);
				// pw.flush();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("*** �޼����� �Է¹޾� ������ ���� �߻� ***");
		} finally {
			try {
				br.close();
				bw.close();
				// pw.close();
				socket.close();
				System.out.println("chatProcess() ����");
			} catch (IOException e) {
			}
		}
	}

	// Client �α���(ID �Է�)
	public void login() {
		try {
			stdin = new BufferedReader(new InputStreamReader(System.in));
			String result;
			String strId;
			do {
				////////////////////////////////////////////
				// 1. Client ID �Է¹ޱ�
				////////////////////////////////////////////
				System.out.print("id�� �Է��Ͻÿ� ==> ");
				strId = stdin.readLine();
				////////////////////////////////////////////

				///////////////////////////////
				// 2. Server �� Client ID ����
				///////////////////////////////
				// strId = strId + System.getProperty("line.separator");
				bw.write(strId + "\n");
				bw.flush();

				// pw.println(strId);
				// pw.flush();
				///////////////////////////////

				// Server �� 'ok' �о����(�̸� �Էµ� ���̵� ���� ��� �����.. ���� ����ص� ����)
				result = br.readLine();

			} while (!result.equals("ok"));

			System.out.println("########### " + strId + "�� �α��� ����" + " ###########");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("login() �� ���� �߻�");
		}
	}

}
