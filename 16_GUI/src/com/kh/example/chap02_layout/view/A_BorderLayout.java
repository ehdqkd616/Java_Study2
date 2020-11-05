package com.kh.example.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class A_BorderLayout extends JFrame {
	
	public A_BorderLayout() {
		super("BorerLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 800, 500);
		
		// BorderLayout
		//		������ 5��(��, ��, ��, ��, ���)�� ������ ��ġ
		setLayout(new BorderLayout());
		
		// ��ư(������Ʈ) ����
//		JButton northB = new JButton("��");
//		JButton southB = new JButton("��");
//		JButton westB = new JButton("��");
//		JButton eastB = new JButton("��");
//		JButton centerB = new JButton("���");
//		
//		add(northB, "North");
//		add(southB, "South");
//		add(westB, "West");
//		add(eastB, "East");
//		add(centerB, "Center");
		
		add(new JButton("��"), "North");
		add(new JButton("��"), "South");
		add(new JButton("��"), "West");
		add(new JButton("��"), "East");
		add(new JButton("���"), "Center");
		
		
		setVisible(true);
		
	}
	

	
	
}
