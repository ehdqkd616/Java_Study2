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
		
		// ������ ���� �� ��ġ, ũ�� ���� �� ���̾ƿ� ����
		setTitle("���� 7");
		setBounds(750, 300, 500, 400);
		getContentPane().setLayout(null);
		
		// Ÿ��Ʋ �� ���� �� �ʱ�ȭ �� ��ġ, ũ�� ����
		JLabel title = new JLabel("������ �Է��ϼ���");
		title.setFont(new Font("����", Font.BOLD, 45));
		title.setBounds(45, 20, 500, 40);
		
		// �ؽ�Ʈ�ʵ� �� ��ư �ʱ�ȭ
		javaScore = new JTextField();
		sqlScore = new JTextField();
		total = new JTextField();
		average = new JTextField();
		calcBtn = new JButton("����ϱ�");
		
		// �� ���� �� �ʱ�ȭ
		JLabel lJavaScore = new JLabel("�ڹ� : ");
		JLabel lSqlScore = new JLabel("SQL : ");
		JLabel lTotal = new JLabel("���� : ");
		JLabel lAverage = new JLabel("��� : ");
		
		// �ؽ�Ʈ �ʵ� �� ��ư ũ��, ��ġ ����
		javaScore.setBounds(80, 100, 120, 30);
		sqlScore.setBounds(320, 100, 120, 30);
		total.setBounds(80, 300, 120, 30);
		average.setBounds(320, 300, 120, 30);
		calcBtn.setBounds(200, 200, 100, 30);
		
		// �� ũ��, ��ġ ����
		lJavaScore.setBounds(40, 100, 50, 30);
		lSqlScore.setBounds(280, 100, 50, 30);
		lTotal.setBounds(40, 300, 50, 30);
		lAverage.setBounds(280, 300, 50, 30);
		
		// �� �߰�
		getContentPane().add(title);
		getContentPane().add(lJavaScore);
		getContentPane().add(lSqlScore);
		getContentPane().add(lTotal);
		getContentPane().add(lAverage);
		
		// �ؽ�Ʈ�ʵ� �߰�
		getContentPane().add(javaScore);
		getContentPane().add(sqlScore);
		getContentPane().add(total);
		getContentPane().add(average);
		
		// ��ư �߰�
		getContentPane().add(calcBtn);
		
		calcBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ڿ� ��ȿ�� ����
				if(javaScore.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ڹ� ������ �Է����ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(sqlScore.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "SQL ������ �Է����ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else {
					// ��ư Ŭ�� �׼� �̺�Ʈ
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
