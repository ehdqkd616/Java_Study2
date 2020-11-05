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
		// 레이아웃을 설정하지 않는다면 기본적으로 BorderLayout
		// 기본 레이아웃까지 없애겠다는 뜻
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		add(lb);
		
		JTextField tf = new JTextField(20);
		tf.setBounds(110, 100, 200, 50);
		add(tf);
		
		JButton btn = new JButton("추 가");
		btn.setBounds(350, 100, 100, 50);
		add(btn);
		
		setVisible(true);
	}
	
	
	
	
}
