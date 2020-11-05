package GUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class AllSearch extends MemberManagements {
	MyFrame frame5 = new MyFrame();
	private JTable table_1;
	public AllSearch() {
		frame5.setTitle("��üȸ��");
		frame5.setSize(700, 448);
		frame5.setLocation(350, 250);
		frame5.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		JTable table = null;
		String[] column =  {
			"�ڵ�", "�̸�", "����", "����", "��ȭ��ȣ", "�����", "�ּ�"
		};
		Object[][] ob = new Object[list.size()][7];
		for(int i=0; i<list.size(); i++){
				ob[i][0] = list.get(i).getCode();
				ob[i][1] = list.get(i).getName();
				ob[i][2] = list.get(i).getAge();
				ob[i][3] = list.get(i).getSex();
				ob[i][4] = list.get(i).getPhone();
				ob[i][5] = list.get(i).getJob();
				ob[i][6] = list.get(i).getAddr();
		}
		
		table= new JTable(ob,column);
		table.getColumn("�ڵ�").setPreferredWidth(50);
		table.getColumn("�̸�").setPreferredWidth(50);
		table.getColumn("����").setPreferredWidth(50);
		table.getColumn("����").setPreferredWidth(50);
		table.getColumn("��ȭ��ȣ").setPreferredWidth(100);
		table.getColumn("�����").setPreferredWidth(100);
		table.getColumn("�ּ�").setPreferredWidth(260);
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		for(int i=0; i<tcm.getColumnCount(); i++){
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
		
		table.setSize(660,387);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(660, 387);	
		scrollPane.setLocation(12, 10);
		scrollPane.setPreferredSize(new Dimension(369, 203));
		frame5.getContentPane().add(scrollPane);
		
		frame5.setVisible(true);
	}
}
