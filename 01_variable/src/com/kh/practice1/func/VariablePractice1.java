package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void practiceMethod() {
		
		// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age = 0;
		double height;
		char gender;
		
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���(��/��) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.println("���̸� �Է��ϼ��� : ");
		try { 
			age = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.printf("Ű %3.1f�� %c�� %s�� �ݰ����ϴ�^^ \n", height, gender, age, name);
	}
	
}
