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
		
		Dialog dialog = new Dialog(frame, "���ο� �� �̸�");
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
				// 1. �Է� ���̾�α�
//				String result = JOptionPane.showInputDialog("������ �Է��ϼ���");
//				System.out.println(result);
				
				// 2. Ȯ�� ���̾�α�
//				int result2 = JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ�� â", JOptionPane.YES_NO_OPTION);
//				int result2 = JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ�� â", JOptionPane.YES_NO_CANCEL_OPTION);
//				System.out.println(result2);
				
				// 3. �˸� ���̾�α�
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
