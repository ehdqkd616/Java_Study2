package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practiceMethod() {
		
		// ���������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		// �� �� ������ ����� ���������� ó���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		double korean;
		double math;
		double english;
		int sum;
		int avg;
		
		System.out.println("���� : ");
		korean = sc.nextDouble();
		
		System.out.println("���� : ");
		english = sc.nextDouble();
		
		System.out.println("���� : ");
		math = sc.nextDouble();
		
		sum = (int)(korean+math+english);
		avg = (int)(korean+math+english)/3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
	}
	
}
