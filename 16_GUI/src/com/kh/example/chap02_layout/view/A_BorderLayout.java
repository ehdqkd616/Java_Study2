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
		//		구역을 5개(동, 서, 남, 북, 가운데)로 나누어 배치
		setLayout(new BorderLayout());
		
		// 버튼(컴포넌트) 생성
//		JButton northB = new JButton("북");
//		JButton southB = new JButton("남");
//		JButton westB = new JButton("서");
//		JButton eastB = new JButton("동");
//		JButton centerB = new JButton("가운데");
//		
//		add(northB, "North");
//		add(southB, "South");
//		add(westB, "West");
//		add(eastB, "East");
//		add(centerB, "Center");
		
		add(new JButton("북"), "North");
		add(new JButton("남"), "South");
		add(new JButton("서"), "West");
		add(new JButton("동"), "East");
		add(new JButton("가운데"), "Center");
		
		
		setVisible(true);
		
	}
	

	
	
}
