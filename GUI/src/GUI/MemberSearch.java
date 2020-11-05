package GUI;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class MemberSearch extends MemberManagements implements ActionListener {
	MyFrame frame5 = new MyFrame();
	JButton sCode = new JButton("ȸ�� �ڵ�");
	JButton sName = new JButton("ȸ�� �̸�");
	JButton sPhone = new JButton("��ȭ ��ȣ");
	JButton sAll = new JButton("��ü ȸ��");
	JButton sCancel = new JButton("���");
	JTextArea textArea = new JTextArea();
	public MemberSearch(){
		frame5.setTitle("ȸ���˻�");
		frame5.setSize(477, 293);
		frame5.setLocation(550, 350);
		frame5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
		JLabel lblNewLabel = new JLabel("�˻�");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setBounds(354, 3, 43, 32);
		frame5.getContentPane().add(lblNewLabel);
		
		sCode.setBounds(354, 40, 95, 32);
		frame5.getContentPane().add(sCode);
		
		sName.setBounds(354, 82, 95, 32);
		frame5.getContentPane().add(sName);
		
		sPhone.setBounds(354, 124, 95, 32);
		frame5.getContentPane().add(sPhone);
		
		sAll.setBounds(354, 166, 95, 32);
		frame5.getContentPane().add(sAll);
		
		sCancel.setBounds(354, 208, 95, 32);
		frame5.getContentPane().add(sCancel);
		
		textArea.setEditable(false);
		textArea.setBounds(12, 9, 331, 234);
		frame5.getContentPane().add(textArea);
		
		JList list_1 = new JList();
		list_1.setBounds(242, 48, 1, 1);
		frame5.getContentPane().add(list_1);
		
		frame5.setVisible(true);
		
		sCode.addActionListener(this);
		sName.addActionListener(this);
		sPhone.addActionListener(this);
		sAll.addActionListener(this);
		sCancel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		int dataCnt=1;
		String[] nameCollection = null;
		String nameCode =null;
		if(e.getSource() == sCode){
			String code = JOptionPane.showInputDialog("�˻��� �ڵ��� �Է��ϼ���");
			if(code == null){
				return;
			}
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(code.equals(list.get(i).getCode())){
						textArea.setText("ȸ�� �ڵ� : "+list.get(i).getCode() + "\n\nȸ�� �̸� : "+list.get(i).getName() 
								+ "\n\nȸ�� ���� : " + list.get(i).getAge() + "\n\nȸ�� ���� : " + list.get(i).getSex()
								+ "\n\nȸ�� ��ȭ��ȣ : " + list.get(i).getPhone() + "\n\n����� : " +list.get(i).getJob() +
								"\n\nȸ�� �ּ� : " + list.get(i).getAddr());
						break;
					}
					dataCnt++;
				}
				if(dataCnt == list.size()+1){
					JOptionPane.showMessageDialog(this, "��ġ�ϴ� ȸ���� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}	
			}else{
				JOptionPane.showMessageDialog(this, "��ϵ� ȸ���� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == sName){
			int cnt = 0;
			String name = JOptionPane.showInputDialog("�˻��� �̸��� �Է��ϼ���");
			if(name == null){
				return;
			}
			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						cnt++;
					}
				}
				if (cnt > 1) {
					nameCollection = new String[cnt];
					int namecnt = 0;
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).getName())) {
							nameCollection[namecnt] = list.get(i).getCode()
									+ ". " + list.get(i).getName() + " "
									+ list.get(i).getPhone();
							namecnt++;
						}
					}
					nameCode = (String) JOptionPane.showInputDialog(this,
							"���� �̸��� �����մϴ�.\n", "�޽���",
							JOptionPane.INFORMATION_MESSAGE, null,
							nameCollection, nameCollection[0]);
					if (nameCode == null) {
						return;
					}
					nameCode = nameCode.substring(0, 4);
					for (int i = 0; i < list.size(); i++) {
						if ((nameCode.equals(list.get(i).getCode()))) {
							textArea.setText("ȸ�� �ڵ� : " + list.get(i).getCode()
									+ "\n\nȸ�� �̸� : " + list.get(i).getName()
									+ "\n\nȸ�� ���� : " + list.get(i).getAge()
									+ "\n\nȸ�� ���� : " + list.get(i).getSex()
									+ "\n\nȸ�� ��ȭ��ȣ : " + list.get(i).getPhone()
									+ "\n\n����� : " + list.get(i).getJob()
									+ "\n\nȸ�� �ּ� : " + list.get(i).getAddr());
						}
					}
				} else {
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).getName())) {
							textArea.setText("ȸ�� �ڵ� : " + list.get(i).getCode()
									+ "\n\nȸ�� �̸� : " + list.get(i).getName()
									+ "\n\nȸ�� ���� : " + list.get(i).getAge()
									+ "\n\nȸ�� ���� : " + list.get(i).getSex()
									+ "\n\nȸ�� ��ȭ��ȣ : " + list.get(i).getPhone()
									+ "\n\n����� : " + list.get(i).getJob()
									+ "\n\nȸ�� �ּ� : " + list.get(i).getAddr());
							break;
						}
						dataCnt++;
					}
					if(dataCnt == list.size()+1){
						JOptionPane.showMessageDialog(this, "��ġ�ϴ� ȸ���� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}else{
				JOptionPane.showMessageDialog(this, "��ϵ� ȸ���� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == sPhone){
			String phone = JOptionPane.showInputDialog("�˻��� ��ȭ��ȣ�� �Է��ϼ���");
			if(phone == null){
				return;
			}
			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (phone.equals(list.get(i).getPhone())) {
						textArea.setText("ȸ�� �ڵ� : " + list.get(i).getCode()
								+ "\n\nȸ�� �̸� : " + list.get(i).getName()
								+ "\n\nȸ�� ���� : " + list.get(i).getAge()
								+ "\n\nȸ�� ���� : " + list.get(i).getSex()
								+ "\n\nȸ�� ��ȭ��ȣ : " + list.get(i).getPhone()
								+ "\n\n����� : " + list.get(i).getJob()
								+ "\n\nȸ�� �ּ� : " + list.get(i).getAddr());
						break;
					}
					dataCnt++;
				}
				if(dataCnt == list.size()+1){
					JOptionPane.showMessageDialog(this, "��ġ�ϴ� ȸ���� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}
			} else{
				JOptionPane.showMessageDialog(this, "��ϵ� ȸ���� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == sAll){
			AllSearch al = new AllSearch();
		}else if(e.getSource() == sCancel){
			frame5.dispose();
			super.MmStart();
		}
	}
}
