package com.kh.example.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// �����̳� ���� ��� 1 : JFrame ���
public class JFrameView1 extends JFrame{
	
	public JFrameView1() {
		
		// ������ �̸� ���� 2 : �θ� �Ļ��� �̿�
		super("super �̸� ����");
		
		// ������ ũ�� ����
		this.setSize(800, 500);
		
		// �������� ���̰� ����
		setVisible(true);
		
		// �ݱ� ��ư�� ������ �� ���μ����� �Բ� ���ᰡ �ǵ��� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// �߰����� ����
		// ������ ��ġ ����
		setLocation(300, 200);
		
		// ũ��� ��ġ�� �� ���� ����
		setBounds(300, 200, 800, 500);
		
		// ������ �̸� ���� 1 : setTitle() �̿�
		setTitle("My First Frame");
		
		// ������ �ΰ� ����
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ������ ������ ����
		setResizable(false);
		
		
		
		
	}

	
}
