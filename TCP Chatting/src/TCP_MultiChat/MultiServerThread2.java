package TCP_MultiChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiServerThread2 extends Thread {
	private Socket socket;
	// private MultiServer2 multiServer2;
	private BufferedReader br = null;
	private BufferedWriter bw = null;
	// private PrintWriter pw = null;

	String strId = "";
	boolean isLogin;
	MultiChatRoom multiChatRoom;

	public MultiServerThread2(Socket tmpSocket, MultiChatRoom tmpMultiChatRoom) {
		socket = tmpSocket;
		multiChatRoom = tmpMultiChatRoom;

		//////////////////////////////////////////////////////////////////////////////
		// 1. ��/��� Stream ����
		//////////////////////////////////////////////////////////////////////////////
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// pw = new PrintWriter(socket.getOutputStream());

		} catch (IOException e) {
			System.out.println("MultiServerThread2 I/O Stream ���� ����");
		}
		//////////////////////////////////////////////////////////////////////////////
	}

	public void run() {
		String message = "";

		//////////////////////////////////////////
		// 1. �α��� ó��(Client ���̵� �޾ƿ���)
		//////////////////////////////////////////
		login();
		//////////////////////////////////////////

		try {
			while (!message.equals("bye")) {
				//////////////////////////////////////////////////////////////////
				// 4. Client �� ���� �޽��� ���� �� Server ���� ���
				//////////////////////////////////////////////////////////////////
				message = br.readLine();

				// ���� �޽������
				System.out.println("���� �޽��� ==> " + strId + " : " + message);
				//////////////////////////////////////////////////////////////////

				////////////////////////////////////////////////////////////////
				// bye �Է� �� ���� ����
				////////////////////////////////////////////////////////////////
				if (message.equals("bye")) {
					multiChatRoom.broadCasting(strId + "���� �����ϼ̽��ϴ�.");
				}
				////////////////////////////////////////////////////////////////

				/////////////////////////////////////////////////////
				// 5. ��� Client ���� �޽��� ����
				/////////////////////////////////////////////////////
				multiChatRoom.broadCasting(strId + " : " + message);
				/////////////////////////////////////////////////////

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("�޼����� �����Ͽ� �۽��� ���� �߻�....");
		} finally {
			multiChatRoom.exitRoom(this);

			try {
				br.close();
				bw.close();
				// pw.close();
				socket.close();
			} catch (Exception e) {
			}

			System.out.println("MultiServerThread2 ����");
		}
	}

	// �α��� (Client ���� Server �� ID �����ؼ� ����)
	public void login() {
		// String members[] = {"�̿���", "������", "���ƶ�"}; //���� ������ ���̵� 3���� �����Ѵٰ� �����Ѵ�.
		// String tempId = null;

		try {
			System.out.println("Client ID �޾ƿ��� ��....");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			///////////////////////////////////////////////
			// Client �� �Է��� ID �޾ƿ���
			///////////////////////////////////////////////
			// tempId = br.readLine();
			strId = br.readLine();
			// System.out.println("Client ID : " + strId);

			///////////////////////////
			// 3. ������ �� �����ֱ�
			///////////////////////////
			multiChatRoom.display();
			///////////////////////////

			sendMessage("ok");
			// System.out.println("���� - �α��� �̸� Ȯ��");
			///////////////////////////////////////////////

		} catch (IOException e) {
			System.out.println("MultiServerThread2 login() ���� �߻�");
		}
	}

	// �޼��� ����
	void sendMessage(String message) {
		try {
			///////////////////////////////////////////
			// �޽��� ����
			///////////////////////////////////////////
			// message = message + System.getProperty("line.separator");
			bw.write(message + "\n"); // \n : �ٹٲ�
			bw.flush(); // ��� ���۸� ���� �޼���

			// pw.println(message);
			// pw.flush();
			///////////////////////////////////////////
		} catch (Exception e) {
			System.out.println("MultiServerThread2 sendMessage() ���� �߻�");
		}
	}

}