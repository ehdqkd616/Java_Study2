package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	
	public void inputScanner1() {
		// �̸�, ����, Ű(�Ҽ���)�� �޾ƿ� �����
		Scanner sc = new Scanner(System.in);
		
		
		String name = "�迬��";
		int age = 24;
		double height = 172.1;
		
		System.out.println(name + "����" + age + "���̸�, Ű��" + height + "cm�Դϴ�.");
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		
		System.out.println("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		System.out.println("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
				
		System.out.println(name + "���� " + age + "���̸�, Ű��" + height + "cm�Դϴ�.");
		
		sc.close();
		
	}
	
	public void inputScanner2() {
	
		Scanner sc = new Scanner(System.in);
		
//		String name;
//		int age = 0;
//		String address;
//		
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		name = sc.next();
//		
//		System.out.println("���̸� �Է��ϼ��� : ");
//		age = sc.nextInt();
//		
//		System.out.println("�ּҸ� �Է��ϼ��� : ");
//		address = sc.next(); // ������ ���ﵿ�̶�� �ϸ� �������� ����(����� �������� ������)
//		address = sc.nextLine();
		
		
		/** 
		next()
			���� �Ұ�(���⸦ �����ڷ� ����)
		nextLine()
			���� ����(������� ��� ���ڿ��� �޾Ƽ� ������ ��)		
		*/
		
		// �ּҸ� ���� �� nextLine() �츮��
		// �츮�� 1. nextLine() �߰�
//		String name;
//		int age = 0;
//		String address;
//		
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		name = sc.next();
//		
//		System.out.println("���̸� �Է��ϼ��� : ");
//		age = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("�ּҸ� �Է��ϼ��� : ");
//		address = sc.nextLine();
		
		// �츮�� 2. age�� ���� �� ���Ͱ� ���� �ʵ��� nextLine()�� �� �� �Ľ��ϱ�
		// �Ľ�(parsing) : ���ڿ�(String)�� �޾ƿ� ���� �ٸ� ������ �ٲ��ִ� ��
//		String name;
//		String stringAge;
//		int age;
//		String address;
//		
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		name = sc.next();
//		
//		System.out.println("���̸� �Է��ϼ��� : ");
//		stringAge = sc.nextLine();
//		age = Integer.parseInt(stringAge);
//		
//		System.out.println("�ּҸ� �Է��ϼ��� : ");
//		address = sc.nextLine();
		
//		String name;
//		int age = 0;
//		String address;
//		
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		name = sc.nextLine();
//		
//		System.out.println("���̸� �Է��ϼ��� : ");
//		try { 
//			age = Integer.parseInt(sc.nextLine());
//		} catch(NumberFormatException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("�ּҸ� �Է��ϼ��� : ");
//		address = sc.nextLine();
		
		
		
//		System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�Դϴ�.");
		
		
		String name;
		String stringAge;
		int age;
		String address;
		char gender;
		String stringGender;
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		
		System.out.println("���̸� �Է��ϼ��� : ");
		stringAge = sc.nextLine();
		age = Integer.parseInt(stringAge);
		
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		address = sc.nextLine();
		
		System.out.println("������ �Է��ϼ��� : ");
//		gender = sc.nextLine().charAt(0);
		stringGender = sc.nextLine();
		gender = stringGender.charAt(0);
		
		System.out.println(name + "���� " + age + "���̸�, ������  " + gender + "�Դϴ�.");
		
		sc.close();
		
	}
}
