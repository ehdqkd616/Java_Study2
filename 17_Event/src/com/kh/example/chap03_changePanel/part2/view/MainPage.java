package com.kh.example.chap03_changePanel.part2.view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MainPage extends JPanel{
	
	private MainFrame mf;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		
		setSize(300, 200);
		setBackground(Color.orange);
		
		addMouseListener(new MyMouseAdapter());
		
		mf.add(this);
	}
	
	
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			SubPage sub = new SubPage(mf);
			changePanel(sub);
			
			
		}
	}
	
	public void changePanel(JPanel panel) {
		mf.remove(this);
		mf.add(panel);
		mf.revalidate();
		mf.repaint();
		
	}
	
	
	
}
