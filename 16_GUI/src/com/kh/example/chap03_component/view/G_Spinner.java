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
		String[] items = {"소설", "잡지", "전공서적", "취미"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner listSpinner = new JSpinner(listModel);
		panel.add(listSpinner);
		
		// Number Spinner
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1); // 시작 값, min, max, 증가 값
		JSpinner numberSpinner = new JSpinner(numberModel);
		panel.add(numberSpinner);
		
		// Date Spinner
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		
		calendar.add(Calendar.YEAR, -50); // 현재 날짜에서 50년이 감소된 날짜가 calendar에 세팅됨
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 100);
		// 이미 calendar는 50년 전으로 세팅이 되어있는 상태이니 현재로부터 50년 뒤를 보려면 100을 더해야 함
		Date end = calendar.getTime(); 
		
		SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		JSpinner dateSpinner = new JSpinner(dateModel);
		dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "yyyy/MM/dd"));
		panel.add(dateSpinner);
		
		JButton button = new JButton("전송");
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
