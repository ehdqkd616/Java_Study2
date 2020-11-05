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
		JFrame frame = new JFrame("라디오버튼 테스트");
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 음료를 주문하시겠습니까?");
		topPanel.add(label);
		frame.add(topPanel, "North");
		
		JPanel sizePanel = new JPanel();
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Medium Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		// 버튼 그룹을 지정해주기
		// 지정하지 않으면 복수 선택이 됨
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		frame.add(sizePanel, "Center");
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultPanel.add(text);
		
		frame.add(resultPanel, "South");
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("small Size가 선택되었습니다.");
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("medium Size가 선택되었습니다.");
			}
		});
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("large Size가 선택되었습니다.");
			}
		});
		
		
		
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
}
