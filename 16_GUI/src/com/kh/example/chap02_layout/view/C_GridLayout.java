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
		//		������Ʈ�� ����, ����, ���� ����ŭ ��ġ�ϰ����� �� �ַ� ���
		setLayout(new GridLayout(5, 5, 10, 20));
		//						����ĭ,	���� ��
		//							����ĭ,	���� ��
		
//		for (int i = 0; i < 26; i++) {
//			String str = new Integer(i).toString();
//			add(new JButton(str));
//		}		
		
		// ������ ����� : �ߺ�����
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
