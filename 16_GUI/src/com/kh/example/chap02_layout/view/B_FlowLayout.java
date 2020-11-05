package com.kh.example.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {
	public B_FlowLayout() {
		super("FlowLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 800, 500);
		
		// FlowLayout
		//		�⺻������ ���� -> ���������� ������Ʈ�� �귯���� ����� ���̾ƿ�
		
		setLayout(new FlowLayout());
		
		add(new JButton("1��"));
		add(new JButton("2��"));
		add(new JButton("3��"));
		add(new JButton("4��"));
		add(new JButton("5��"));
		add(new JButton("6��"));
		add(new JButton("7��"));
		add(new JButton("8��"));
		add(new JButton("9��"));
		add(new JButton("10��"));
		add(new JButton("11��"));
		add(new JButton("12��"));
		add(new JButton("13��"));
		add(new JButton("14��"));
		add(new JButton("15��"));
		
		// �⺻������ ��� ����
//		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// ���� ����
//		setLayout(new FlowLayout(FlowLayout.LEFT));
//		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		// ������ ����
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
//		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		setVisible(true);
		
		
		
		
		
	}

}
