package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void practiceMethod() {
		
	// ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
	
		Scanner sc = new Scanner(System.in);
		
		String str;
		int i;
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		str = sc.nextLine();
		
		for(i=0; i<3; i++) {
			System.out.printf("%d ��° ���� : %c \n", i+1, str.charAt(i));
		}
		
	}
}
