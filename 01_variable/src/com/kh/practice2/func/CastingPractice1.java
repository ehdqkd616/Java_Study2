package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void practiceMethod() {
		
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		char char1;
		char char2;
		int charInt1;
		int charInt2;
		
		
		System.out.println("���� : ");
		char1 = sc.next().charAt(0);
		
		charInt1 = (int)char1;
		
		System.out.printf("%c unicode : %d \n", char1, charInt1);
		
		
		System.out.println("���� : ");
		char2 = sc.next().charAt(0);
		
		charInt2 = (int)char2;
		
		System.out.printf("%c unicode : %d \n", char2, charInt2);
		
	}
	
}
