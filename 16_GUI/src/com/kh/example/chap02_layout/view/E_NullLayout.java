package com.kh.example.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame {
	public E_NullLayout() {
		super("NullLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 500);
		
		setLayout(null);
		// ���̾ƿ��� �������� �ʴ´ٸ� �⺻������ BorderLayout
		// �⺻ ���̾ƿ����� ���ְڴٴ� ��
		
		JLabel lb = new JLabel("�̸� : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		add(lb);
		
		JTextField tf = new JTextField(20);
		tf.setBounds(110, 100, 200, 50);
		add(tf);
		
		JButton btn = new JButton("�� ��");
		btn.setBounds(350, 100, 100, 50);
		add(btn);
		
		setVisible(true);
	}
	
	
	
	
}
