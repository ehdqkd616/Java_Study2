package com.kh.example.chap03_changePanel.part2.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		setSize(300, 200);
		
		new MainPage(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
}
