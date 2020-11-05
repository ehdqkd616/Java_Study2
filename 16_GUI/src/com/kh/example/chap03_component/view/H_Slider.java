package com.kh.example.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class H_Slider {
	public void doSlider() {
		JFrame frame = new JFrame();
				
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0, 30, 15); // �ּҰ�, �ִ밪, �⺻ ��
		
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		panel2.add(slider);
		
		JButton button = new JButton("����");
		panel2.add(button);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("��� �� : ");
		resultPanel.add(text);
		JLabel result = new JLabel();
		resultPanel.add(result);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(slider.getValue() + "");
				
			}
		});
		
		frame.add(panel1, "North");
		frame.add(panel2, "Center");
		frame.add(resultPanel, "South");
		
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
