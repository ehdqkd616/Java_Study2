package com.kh.example.chap02_layout.view;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("GirdLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 800, 500);
		
		// GridLayout
		//		컴포넌트를 가로, 세로, 일정 수만큼 배치하고자할 때 주로 사용
		setLayout(new GridLayout(5, 5, 10, 20));
		//						가로칸,	가로 갭
		//							세로칸,	세로 갭
		
//		for (int i = 0; i < 26; i++) {
//			String str = new Integer(i).toString();
//			add(new JButton(str));
//		}		
		
		// 빙고판 만들기 : 중복제거
		Set<Integer> set = new LinkedHashSet<Integer>();
		while(set.size() < 25) {
			set.add((int)(Math.random() * 25) + 1);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
//			add(new JButton(it.next().toString()));
			add(new JButton(it.next() + ""));
		}
		
		
		
		setVisible(true);
		
		
		
		
		
	}
	
	
}
