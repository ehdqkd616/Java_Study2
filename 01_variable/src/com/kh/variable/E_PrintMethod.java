package com.kh.variable;

public class E_PrintMethod {
	
	public void printlnMethod() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public void printMethod() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";		
		System.out.print(str1);
		System.out.print(str2);
		
		System.out.printf("%s, �迬���Դϴ�. %s.", str1, str2);
		
		System.out.println();
//		System.out.print();
//		System.out.printf();
		
		// �̴� ����
		// �ȳ��ϼ���, ���� 20�� �迬�� �л��Դϴ�. ������ �ݰ����ϴ�.
		int age = 20;
		String name = "�迬��";
		String job = "�л�";
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.\n", str1, age, job, name, str2);
	}
	
	
	
}
