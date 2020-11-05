package com.kh.example.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class G_Spinner {
	public void doSpinner() {
		JFrame frame = new JFrame();
		frame.setSize(500, 120);
		
		JPanel panel = new JPanel();
		
		// List Spinner
		String[] items = {"�Ҽ�", "����", "��������", "���"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner listSpinner = new JSpinner(listModel);
		panel.add(listSpinner);
		
		// Number Spinner
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1); // ���� ��, min, max, ���� ��
		JSpinner numberSpinner = new JSpinner(numberModel);
		panel.add(numberSpinner);
		
		// Date Spinner
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		
		calendar.add(Calendar.YEAR, -50); // ���� ��¥���� 50���� ���ҵ� ��¥�� calendar�� ���õ�
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 100);
		// �̹� calendar�� 50�� ������ ������ �Ǿ��ִ� �����̴� ����κ��� 50�� �ڸ� ������ 100�� ���ؾ� ��
		Date end = calendar.getTime(); 
		
		SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		JSpinner dateSpinner = new JSpinner(dateModel);
		dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "yyyy/MM/dd"));
		panel.add(dateSpinner);
		
		JButton button = new JButton("����");
		panel.add(button);
		
		frame.add(panel, "North");
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel();
		resultPanel.add(text);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = listSpinner.getValue() + ", "
							+ numberSpinner.getValue() + ", "
							+ dateSpinner.getValue();
				text.setText(str);
			}
		});
		
		frame.add(resultPanel, "Center");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
