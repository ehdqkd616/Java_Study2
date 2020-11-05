package com.kh.example.chap03_component.view;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class I_Dialog {
	public void doDialog() {
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Simple Dialog");
		panel.add(button1);
		
		Dialog dialog = new Dialog(frame, "새로운 참 이름");
		dialog.setBounds(150, 250, 200, 200);
		dialog.add(new JLabel("simple dialog test"), "North");
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		JButton button2 = new JButton("clsoe");
		dialog.add(button2, "Center");
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}
		});
		
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력 다이어로그
//				String result = JOptionPane.showInputDialog("내용을 입력하세요");
//				System.out.println(result);
				
				// 2. 확인 다이어로그
//				int result2 = JOptionPane.showConfirmDialog(null, "확인하시겠습니까?", "확인 창", JOptionPane.YES_NO_OPTION);
//				int result2 = JOptionPane.showConfirmDialog(null, "확인하시겠습니까?", "확인 창", JOptionPane.YES_NO_CANCEL_OPTION);
//				System.out.println(result2);
				
				// 3. 알림 다이어로그
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
