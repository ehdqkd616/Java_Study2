package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	public ScoreFrame() {
		
		// 프레임 정의 및 위치, 크기 조정 및 레이아웃 설정
		setTitle("문제 7");
		setBounds(750, 300, 500, 400);
		getContentPane().setLayout(null);
		
		// 타이틀 라벨 선언 및 초기화 및 위치, 크기 조정
		JLabel title = new JLabel("점수를 입력하세요");
		title.setFont(new Font("굴림", Font.BOLD, 45));
		title.setBounds(45, 20, 500, 40);
		
		// 텍스트필드 및 버튼 초기화
		javaScore = new JTextField();
		sqlScore = new JTextField();
		total = new JTextField();
		average = new JTextField();
		calcBtn = new JButton("계산하기");
		
		// 라벨 선언 및 초기화
		JLabel lJavaScore = new JLabel("자바 : ");
		JLabel lSqlScore = new JLabel("SQL : ");
		JLabel lTotal = new JLabel("총점 : ");
		JLabel lAverage = new JLabel("평균 : ");
		
		// 텍스트 필드 및 버튼 크기, 위치 조정
		javaScore.setBounds(80, 100, 120, 30);
		sqlScore.setBounds(320, 100, 120, 30);
		total.setBounds(80, 300, 120, 30);
		average.setBounds(320, 300, 120, 30);
		calcBtn.setBounds(200, 200, 100, 30);
		
		// 라벨 크기, 위치 조정
		lJavaScore.setBounds(40, 100, 50, 30);
		lSqlScore.setBounds(280, 100, 50, 30);
		lTotal.setBounds(40, 300, 50, 30);
		lAverage.setBounds(280, 300, 50, 30);
		
		// 라벨 추가
		getContentPane().add(title);
		getContentPane().add(lJavaScore);
		getContentPane().add(lSqlScore);
		getContentPane().add(lTotal);
		getContentPane().add(lAverage);
		
		// 텍스트필드 추가
		getContentPane().add(javaScore);
		getContentPane().add(sqlScore);
		getContentPane().add(total);
		getContentPane().add(average);
		
		// 버튼 추가
		getContentPane().add(calcBtn);
		
		calcBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 문자열 유효성 검증
				if(javaScore.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "자바 점수를 입력해주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(sqlScore.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "SQL 점수를 입력해주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else {
					// 버튼 클릭 액션 이벤트
					int java = Integer.parseInt(javaScore.getText());
					int sql = Integer.parseInt(sqlScore.getText());
					String stotal = String.valueOf(java+sql);
					String saverage = String.valueOf((java+sql)/2);
					total.setText(stotal);
					average.setText(saverage);
				}
			}
		});
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
