package com.kh.example.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {
	public D_CardLayout() {
		super("CardLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 800, 500);
		
		// CardLayout
		//		Panel을 이용해서 카드 판을 겹쳐 놓음
		CardLayout card = new CardLayout();
		setLayout(card);
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		card1.setBackground(Color.PINK);
		card2.setBackground(Color.YELLOW);
		card3.setBackground(new Color(50, 100, 100));
		
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		add(card1);
		add(card2);
		add(card3);
		
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card1.getParent());
				} else if(e.getButton() == 3) {
					card.previous(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card2.getParent());
				} else if(e.getButton() == 3) {
					card.previous(card2.getParent());
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card3.getParent());
				} else if(e.getButton() == 3) {
					card.previous(card3.getParent());
				}
			}
		});
		
		
		
		setVisible(true);
		
		
		
		
		
	}
}
