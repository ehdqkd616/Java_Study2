package com.kh.example.chap03_component.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class B_RadioButton {
	public void doRadioButton() {
		JFrame frame = new JFrame("������ư �׽�Ʈ");
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� ���Ḧ �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		frame.add(topPanel, "North");
		
		JPanel sizePanel = new JPanel();
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Medium Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		// ��ư �׷��� �������ֱ�
		// �������� ������ ���� ������ ��
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		frame.add(sizePanel, "Center");
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		resultPanel.add(text);
		
		frame.add(resultPanel, "South");
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("small Size�� ���õǾ����ϴ�.");
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("medium Size�� ���õǾ����ϴ�.");
			}
		});
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("large Size�� ���õǾ����ϴ�.");
			}
		});
		
		
		
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
}
