package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	// ��ü �迭 == ��ü(���۷��� ����)�� ���� �迭
	
	public void method1() {
		Person[] pArr = new Person[5];
		// Person��ü�� �� �� �ִ� 5���� ���� ����
		
		pArr[0] = new Person("�迬��", 24, 'M', 180.1, 65.6);
		pArr[1] = new Person("��ٺ�", 24, 'W', 185.2, 50.7);
		pArr[2] = new Person("��˰�", 24, 'M', 175.3, 70.8);
		pArr[3] = new Person("����", 24, 'M', 170.4, 75.9);
		pArr[4] = new Person("�迬��", 24, 'W', 160.5, 45.1);
		
		System.out.println("pArr : " + pArr);
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		
		// �ε��� ���� ��ü�� �����ؼ� �����ؾ� ��
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
		}
		
		System.out.println();
		
	}
	
	public void method2() {
		Person[] pArr = {
				new Person("������", 27, 'W', 173.1, 60.4),
				new Person("�ż���", 7, 'W', 50.2, 6.5),
				new Person("��¯��", 17, 'W', 170.3, 65.6)};
		
		System.out.println("pArr : " + pArr);
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		
		// �ε��� ���� ��ü�� �����ؼ� �����ؾ� ��
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
		}
		
		System.out.println();
		
	}	
	
}
