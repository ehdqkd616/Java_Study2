package com.kh.variable;

public class D_Cast {
	public void rule1() {
		
		int num = 'A'; // �ڵ� ����ȯ
		// char�� �����ڵ�� ���� (���� �� ����)
		System.out.println("num�� �����ڵ� �� : " + num);
		// char�� �����ڵ�� ���� (���� �� ����)
		
		char ch = 97; // �ڵ� ����ȯ
		System.out.println("ch : " + ch);
		
//		char ch2 = num;
//		Type mismatch : cannot convert from int to char		
		char ch2 = (char)num;
		System.out.println("num�� char ��ȯ �� : " + ch2);
		
		int num2 = -97;
		
//		char ch3 = num2;
		char ch3 = (char)num2;
		System.out.println("num2�� char ��ȯ �� : " + ch3);
	}
	
	public void rule2() {
		
		int iNum = 10;
		long lNum = 100;
		
		// int sum = iNum + lNum;
		// ������ ū �ڷ������� �ڵ� ����ȯ �� ����ó���� �Ǳ� ������ iNum�� long������ �ٲ��
		// long�� + long������ ������� long������ �Ǿ���
		// long���� ��� ���� int���� ��� �� �����Ƿ� ������ ����
		
//		int sum1 = iNum + lNum;
		// �ذ� 1. ���� ������ int�� ���� ����ȯ 
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// �ذ� 2. long���� int�� ���� ����ȯ
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// �ذ� 3. long������ �ڷ����� ����
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
		
	}
	
		
}
