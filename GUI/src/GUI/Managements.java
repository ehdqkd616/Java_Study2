package GUI;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Managements extends MemberManagements  implements ActionListener, ItemListener {
	MyFrame frame2 = new MyFrame();
	JButton add = new JButton("ȸ�� �߰�");
	JButton edit = new JButton("ȸ�� ����");
	JButton delete = new JButton("ȸ�� ����");
	JButton cancel = new JButton("���");
	JComboBox cb = new JComboBox();
	private JLabel select = new JLabel("ȸ�� ����");
	private final JTextArea memInfo = new JTextArea();
	
	public Managements(){
		frame2.setTitle("ȸ������");
		frame2.setSize(331, 285);
		frame2.setLocation(550, 350);
		frame2.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
		cb.setBounds(12, 39, 183, 21);
		cb.addItem("ȸ���� �����ϼ���");
		for(int i=0; i<list.size(); i++){
			cb.addItem(list.get(i).getCode() + ". " + list.get(i).getName());
		}
		frame2.getContentPane().add(cb);
		
		edit.setBounds(207, 40, 97, 32);
		frame2.getContentPane().add(edit);
		
		delete.setBounds(207, 82, 97, 32);
		frame2.getContentPane().add(delete);
		
		cancel.setBounds(207, 166, 97, 32);
		frame2.getContentPane().add(cancel);
		
		select.setBounds(12, 14, 57, 15);
		frame2.getContentPane().add(select);
		
		memInfo.setEditable(false);
		memInfo.setBounds(12, 80, 183, 152);
		frame2.getContentPane().add(memInfo);
		
		add.setBounds(207, 124, 97, 32);
		frame2.getContentPane().add(add);
		
		add.addActionListener(this);
		edit.addActionListener(this);
		delete.addActionListener(this);
		cancel.addActionListener(this);
		cb.addItemListener(this);

		
		frame2.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie){
		if(cb.getSelectedIndex()!=0){
			int select = cb.getSelectedIndex()-1;
			memInfo.setText("ȸ�� �ڵ� : "+list.get(select).getCode() + "\nȸ�� �̸� : "+ list.get(select).getName() 
				+ "\nȸ�� ���� : " + list.get(select).getAge()  + "\nȸ�� ���� : " + list.get(select).getSex()  + "\nȸ�� ��ȭ��ȣ : " 
				+ list.get(select).getPhone()  + "\n���� : " +list.get(select).getJob()  +	"\nȸ�� �ּ� : " +list.get(select).getAddr());
		}else{
			memInfo.setText(null);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == edit){
			int select = cb.getSelectedIndex();
			Edit ed = new Edit(select);
			frame2.dispose();
		}else if(e.getSource() == delete){
			int select = cb.getSelectedIndex()-1;
			list.remove(select);
			cb.removeItemAt(select+1);
		}else if(e.getSource() == add){
			frame2.dispose();
			MemberRegister mr = new MemberRegister();
		}else if(e.getSource() == cancel){
			frame2.dispose();
			super.MmStart();
		}
	}
}
