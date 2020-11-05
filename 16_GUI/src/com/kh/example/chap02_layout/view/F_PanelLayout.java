package com.kh.example.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{
	public F_PanelLayout() {
		super("PanelLayout");
		setBounds(300, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		// 레이아웃을 설정하지 않는다면 기본적으로 BorderLayout
		// 기본 레이아웃까지 없애겠다는 뜻
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		panel.add(lb);
		
		JTextField tf = new JTextField(20);
		tf.setBounds(110, 100, 200, 50);
		panel.add(tf);
		
		JButton btn = new JButton("추 가");
		btn.setBounds(350, 100, 100, 50);
		panel.add(btn);
		
		add(panel);
		
		setVisible(true);
		
		
	}


	
	
}
