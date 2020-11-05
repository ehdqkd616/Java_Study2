package com.kh.example.chap03_component.view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class J_Table {
	public void doTable() {
		JFrame frame = new JFrame();
		
		String[] header = {"이름", "자바", "디비", "화면"};
		Object[][] data = {{"강건강", 100, 95, 85},
							{"남나눔", 58, 95, 78},
							{"박서진", 42, 14, 100},
							{"임정현", 65, 67, 55}};
		
//		JTable table = new JTable(data, header);
//		frame.add(table);
//		JScrollPane jScrollPane = new JScrollPane(table);
//		jScrollPane.setPreferredSize(new Dimension(200, 80));
//		frame.add(jScrollPane);
		
//		DefaultTableModel dtm = new DefaultTableModel(data, header);
		DefaultTableModel dtm = new DefaultTableModel(data, header) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		JTable table = new JTable(dtm);
		JScrollPane jScrollPane = new JScrollPane(table);		
		frame.add(jScrollPane, "North");
		
		Object[] addArr = {"문미미", 58, 75, 71};
		dtm.addRow(addArr);
		
		System.out.println(dtm.getRowCount());
		System.out.println(dtm.getColumnCount());
		
		System.out.println(dtm.getColumnName(0));
		
		dtm.removeRow(0);
		
		System.out.println(dtm.getValueAt(1, 2));
		
		dtm.setValueAt(5000, 2, 2);
		
		table.getTableHeader().setReorderingAllowed(false);
		
		table.getTableHeader().setResizingAllowed(false);
		
		table.setRowSelectionInterval(0, 1);
		
//		table.setEnabled(false);
		
//		table.setCellSelectionEnabled(false);
		
		JPanel select = new JPanel();
		JTextArea ta = new JTextArea(10, 30);
		select.add(ta);
		frame.add(select, "South");
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
//				System.out.println(table.getSelectedRow());
				int selectRow = table.getSelectedRow();
				int colNum = dtm.getColumnCount();
				Object[] objArr = new Object[colNum];			
				for (int i = 0; i < colNum ; i++) {
					objArr[i] = dtm.getValueAt(selectRow, i);
					
					if(i == colNum - 1) {
						ta.append(objArr[i] + "\n");
					} else {
						ta.append(objArr[i] + " ");
					}
				}
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
