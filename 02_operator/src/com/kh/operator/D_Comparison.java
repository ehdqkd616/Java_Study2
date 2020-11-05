package com.kh.operator;

public class D_Comparison {
	// �� ������
	// �� ���� �������� ���踦 ������ ������
	// ������ �����ϸ� true, �������� ���ϸ� false ��ȯ
	// <	a < b : a�� b���� ������? (a�� b���� ������ true ��ȯ)
	// >	a > b : a�� b���� ū��? (a�� b���� ũ�� true ��ȯ)
	// <=	a <= b : a�� b���� �۰ų� ������?
	// >=	a >= b : a�� b���� ũ�ų� ������?
	// ==	a == b : a�� b�� ������?
	// !=	a != b : a�� b�� �ٸ���?
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		// ���� ����
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1 = (a == b);
		result2 = (a <= b);
		result3 = (a > b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		// b�� ¦���ΰ�
		System.out.println("b�� ¦���ΰ�? " + (b % 2 == 0));
		// b�� Ȧ���ΰ�
		System.out.println("b�� Ȧ���ΰ�? " + (b % 2 == 1));
		System.out.println("b�� Ȧ���ΰ�? " + (b % 2 != 0));
		
	}
	
}
