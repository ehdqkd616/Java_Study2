package com.kh.example.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class E_ComboBox {
	public void doComboBox() {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		
		String[] animals = {"dog", "cat", "tiger"};
		
		JComboBox<String> animalList = new JComboBox<String>(animals);
		
		animalList.setSelectedIndex(1);
		
		JLabel label = new JLabel();
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String name = (String)cb.getSelectedItem();
				Image img = new ImageIcon("image/" + name + ".PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
			}
		});
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(animalList, "North");
		frame.add(label, "South");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
