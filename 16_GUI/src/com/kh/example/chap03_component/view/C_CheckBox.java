package com.kh.example.chap03_component.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_CheckBox {
	public void doCheckBox() {
		JFrame frame = new JFrame();
		
//		JCheckBox cb1 = new JCheckBox("apple");
//		JCheckBox cb2 = new JCheckBox("orange");
//		JCheckBox cb3 = new JCheckBox("banana");
		
		String[] fruits = {"apple", "oragne", "banana"};
		JCheckBox[] buttons = new JCheckBox[3];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		JPanel checkPanel = new JPanel();
//		checkPanel.add(cb1);
//		checkPanel.add(cb2);
//		checkPanel.add(cb3);
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		
		ButtonGroup b = new ButtonGroup();
		for (int i = 0; i < buttons.length; i++) {
			b.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("���õ� ������ �����ϴ�.");
		resultPanel.add(text);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int count = 0;
					
					for (int j = 0; j < buttons.length; j++) {
						if(buttons[j].isSelected()) {
							result += buttons[j].getText() + " ";
							count++;
						}
						
						text.setText(result);
					}
					
					if(count == 0) {
						text.setText("���õ� ������ �����ϴ�.");
					}
				}
			});
		}
		
		
		frame.add(checkPanel, "North");
		frame.add(resultPanel, "Center");
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	
}
