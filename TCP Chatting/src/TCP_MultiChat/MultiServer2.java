package TCP_MultiChat;

import java.io.IOException;

import java.net.ServerSocket;

import java.net.Socket;

import java.util.ArrayList;

/*

 * 1:N ä��

 * N ���� Client ���� ������� ��ȭ�� �����ϵ��� ����

 */

public class MultiServer2 {

	public static void main(String[] args) {

		Socket socket = null;

		ServerSocket serverSocket = null;

		MultiChatRoom multiChatRoom = null; // MultiCatRoom ��ü

		MultiServerThread2 mst = null; // Client ���� �ӽ� ��ü

		int portNumber = 3000; // port ��ȣ

		try {

			/////////////////////////////////////

			// 1. MultiChatRoom ��ä ����

			/////////////////////////////////////

			multiChatRoom = new MultiChatRoom();

			/////////////////////////////////////

			//////////////////////////////////////////////////////////

			// 2. portNumber �� ������� �ϴ� ���� ����

			//////////////////////////////////////////////////////////

			serverSocket = new ServerSocket(portNumber);

			System.out.println("##################################");

			System.out.println("#        Server �غ� �Ϸ�        #");

			System.out.println("##################################");

			//////////////////////////////////////////////////////////

			// Server ����

			while (true) {

				////////////////////////////////////////////////////////////////////////////

				// 3. Client�� �����û ���, ����Ǹ� Client Socket �� �������

				////////////////////////////////////////////////////////////////////////////

				socket = serverSocket.accept();

				System.out.println(socket.getInetAddress() + " ����");

				////////////////////////////////////////////////////////////////////////////

				/////////////////////////////////////////////////////////

				// 4. ���ӵ� Client �� ArrayList�� ����

				/////////////////////////////////////////////////////////

				// ä�� ��ü ����

				mst = new MultiServerThread2(socket, multiChatRoom);

				// Thread �۵����� 1)�α��� ó�� 2)ä�� ����

				mst.start();

				// ä�� ��ü�� ArrayList�� ����

				multiChatRoom.enterRoom(mst);

				/////////////////////////////////////////////////////////

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
