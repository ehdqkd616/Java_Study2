package com.kh.example.chap03_component.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class F_List {
	public void doList() {
		JFrame frame = new JFrame();
		String[] cities = {"서울", "대전", "대구", "부산", "경기", "인천", "강원", "제주"};
		
		JList<String> list = new JList<String>(cities);
		
		JPanel resultPanel = new JPanel();
		JLabel label = new JLabel("선택된 항목 : ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				List<String> l = list.getSelectedValuesList();
				String result = "";
				for (int i = 0; i < l.size(); i++) {
					result += l.get(i) + " ";
				}
				
				selected.setText(result);	
			}
		});
		
		resultPanel.add(label);
		resultPanel.add(selected);
		
//		frame.add(list, "North");
		frame.add(resultPanel, "Center");
		
		JScrollPane scroller = new JScrollPane(list);
		scroller.setPreferredSize(new Dimension(200, 100));
		frame.add(scroller, "North");
		
		list.setBorder(BorderFactory.createLineBorder(Color.pink, 5));
		
//		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
