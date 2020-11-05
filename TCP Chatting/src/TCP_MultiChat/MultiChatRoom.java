package TCP_MultiChat;

import java.util.ArrayList;

public class MultiChatRoom {

	ArrayList<MultiServerThread2> list = new ArrayList<MultiServerThread2>();

	// Server �� �����ִ� ȭ�� : ������ ��, ������ ��
	public void display() {
		// ������ ��
		System.out.println("���� ������ ���� : ������ �� -> " + list.size());

		// ���� ���ӵ� Client ID ������, ���� ������ Client �� ���� ��� �������� ���� - ����...

		if (list.size() != 0) {
			System.out.println("******** ������ Client ID ********");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).strId);
			}
			System.out.println("**********************************");
		}

	}

	// Client �� ArrayList �� �߰�
	public void enterRoom(MultiServerThread2 tmpMultiServerThread2) {
		list.add(tmpMultiServerThread2);
	}

	// Client ���� �޽��� ����
	public void broadCasting(String message) {
		MultiServerThread2 multiServerThread2 = null;

		for (int i = 0; i < list.size(); i++) {
			multiServerThread2 = list.get(i);
			multiServerThread2.sendMessage(message);
		}
	}

	// Client �� ä�ÿ��� ���� ��
	public void exitRoom(MultiServerThread2 tmpMultiServerThread2) {
		boolean isDelete = list.remove(tmpMultiServerThread2);
		if (isDelete) {
			System.out.println(tmpMultiServerThread2.strId + " Client�� MultiServerThread2���� ����");
		} else {
			System.out.println(tmpMultiServerThread2.strId + " Client�� MultiServerThread2���� ���� ����");
		}
	}

}
