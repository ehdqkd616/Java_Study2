package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practiceMethod() {
		
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("ù ��° ���� : ");
		a = sc.nextInt();
		
		System.out.println("�� ��° ���� : ");
		b = sc.nextInt();
		
		System.out.printf("���ϱ� ��� : %d\n", a+b);
		System.out.printf("���� ��� : %d\n", a-b);
		System.out.printf("���ϱ� ��� : %d\n", a*b);
		System.out.printf("������ ��� : %d\n", a/b);
	}
	
}
