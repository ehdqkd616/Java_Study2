package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practiceMethod() {
		
	// Ű����� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
	
		Scanner sc = new Scanner(System.in);
		
		double horizontal;
		double vertical;
		
		System.out.println("���� : ");
		horizontal = sc.nextDouble();
		
		System.out.println("���� : ");
		vertical = sc.nextDouble();
		
		double area = horizontal*vertical;
		double circum = 2*(horizontal+vertical);
		
		System.out.printf("���� : %.2f\n", area);
		System.out.printf("�ѷ� : %.2f\n", circum);
	}
	
}
