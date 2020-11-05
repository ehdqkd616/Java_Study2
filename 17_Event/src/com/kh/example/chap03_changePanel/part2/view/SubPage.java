package com.kh.example.chap03_changePanel.part2.view;

import java.awt.Color;

import javax.swing.JPanel;

public class SubPage extends JPanel {
	
	public SubPage(MainFrame mf) {
		setSize(300, 200);
		setBackground(Color.green);
		
		mf.add(this);
	}
	
	
}
