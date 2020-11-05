package ncs.test7_answer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	public ScoreFrame() {
		setLayout(new BorderLayout());
		
		JLabel infoLabel = new JLabel("점수를 입력하세요");
		infoLabel.setFont(infoLabel.getFont().deriveFont(50.0f));
		add(infoLabel, "North");
		
		JPanel resultPanel = new JPanel(new BorderLayout());
		
		JPanel scorePanel = new JPanel(new GridLayout(1, 2));
		
		JPanel javaPanel = new JPanel();
		javaPanel.add(new JLabel("자바 : "));
		javaScore = new JTextField(10);
		javaPanel.add(javaScore);
		
		JPanel sqlPanel = new JPanel();
		sqlPanel.add(new JLabel("SQL : "));
		sqlScore = new JTextField(10);
		sqlPanel.add(sqlScore);
		
		scorePanel.add(javaPanel);
		scorePanel.add(sqlPanel);
		
		JPanel buttonPanel = new JPanel(new BorderLayout());

		JPanel emptyPanel1 = new JPanel();
		emptyPanel1.setPreferredSize(new Dimension(100, 50));
		
		calcBtn = new JButton("계산하기");
		JPanel realButtonPanel = new JPanel(new FlowLayout());
		realButtonPanel.add(calcBtn);
		
		JPanel emptyPanel2 = new JPanel();
		emptyPanel2.setPreferredSize(new Dimension(100, 50));
		
		buttonPanel.add(emptyPanel1, "North");
		buttonPanel.add(realButtonPanel, "Center");
		buttonPanel.add(emptyPanel2, "South");
		
		
		JPanel calcPanel = new JPanel(new GridLayout(1, 2));
		
		JPanel totalPanel = new JPanel();
		totalPanel.add(new JLabel("총점 : "));
		total = new JTextField(10);
		totalPanel.add(total);
		
		JPanel avgPanel = new JPanel();
		avgPanel.add(new JLabel("평균 : "));
		average = new JTextField(10);
		avgPanel.add(average);
		
		calcPanel.add(totalPanel);
		calcPanel.add(avgPanel);
		
		resultPanel.add(scorePanel, "North");
		resultPanel.add(buttonPanel, "Center");
		resultPanel.add(calcPanel, "South");
		
		add(resultPanel);
		
		calcBtn.addActionListener(new ActionHandler());
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int java = Integer.parseInt(javaScore.getText());
			int sql = Integer.parseInt(sqlScore.getText());
			
			int totalNum = java + sql;
			int avgNum = totalNum / 2;
			
			total.setText(totalNum + "");
			average.setText(avgNum + "");
		}
		
	}
}
