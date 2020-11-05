package com.kh.example.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_ImageLabel {
	public void doImageLabel() {
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		ImageIcon imageIcon = new ImageIcon("image/user.PNG");
		Image image = imageIcon.getImage();
		Image icon = image.getScaledInstance(150, 150, 0);
		
		JLabel label = new JLabel(new ImageIcon(icon));
		
		JButton button = new JButton("이미지 보기");
		button.addActionListener(new ActionListener() {
			
			int status = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(status == 0) {
					Image icon = new ImageIcon("image/dog.PNG").getImage().getScaledInstance(150, 150, 0);
					label.setIcon(new ImageIcon(icon));
					status = 1;
				} else {
					Image icon = new ImageIcon("image/user.PNG").getImage().getScaledInstance(150, 150, 0);
					label.setIcon(new ImageIcon(icon));
					status = 0;
				}

			}
		});
		
			
		panel.add(label, "Center");
		panel.add(button, "South");
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
}
