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
		//		기본적으로 왼쪽 -> 오른쪽으로 컴포넌트가 흘러가는 방식의 레이아웃
		
		setLayout(new FlowLayout());
		
		add(new JButton("1번"));
		add(new JButton("2번"));
		add(new JButton("3번"));
		add(new JButton("4번"));
		add(new JButton("5번"));
		add(new JButton("6번"));
		add(new JButton("7번"));
		add(new JButton("8번"));
		add(new JButton("9번"));
		add(new JButton("10번"));
		add(new JButton("11번"));
		add(new JButton("12번"));
		add(new JButton("13번"));
		add(new JButton("14번"));
		add(new JButton("15번"));
		
		// 기본적으로 가운데 정렬
//		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// 왼쪽 정렬
//		setLayout(new FlowLayout(FlowLayout.LEFT));
//		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		// 오른쪽 정렬
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
//		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		setVisible(true);
		
		
		
		
		
	}

}
