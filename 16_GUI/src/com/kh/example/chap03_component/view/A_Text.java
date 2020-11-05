package com.kh.example.chap03_component.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_Text {
	
	public void doText() {
		JFrame frame = new JFrame();
//		frame.setSize(800, 500);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
//		panel.setSize(800, 500);
		
		// TextField : 글을 입력할 수 있는 텍스트 상자
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		// PasswordField : 비밀번호를 입력할 수 있는 TextField
		// 입력되는 값을 화면 상에서 볼 수 없으며, 한글 입력 불가
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		// TextArea : 여러 줄의 텍스트를 입력할 수 있는 상자
		JTextArea textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(textArea, BorderLayout.CENTER);
		frame.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				id.setText("");
				
				String showPwd = "";
				char[] pwdArr = password.getPassword();
				for (int i = 0; i < pwdArr.length; i++) {
					showPwd += pwdArr[i] + "";
				}
				
				text += "password = " + showPwd + "\n";
				password.setText("");
				
				textArea.append(text);
				id.requestFocus();
				
			}
		});
		
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
