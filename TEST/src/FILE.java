import java.net.InetAddress;
import java.net.Socket;

public class FILE {

	public void fileUpload() {

		int port = 3000;
		String serverIP;
		try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		// 2. ���� ��ü ���� : ������ ���ÿ� ������ ���� ��û��
		Socket socket = new Socket(serverIP, port);
		// ���� ���д� null ���ϵ�
		//���� �ڵ� �߰� ����.....
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
		
	

