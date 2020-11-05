package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		// ������ �Է� �޾� ����� ���� 1���� �Է� ���� ������ Ȧ��/¦���� ������
		// Ȧ���� ��, ¦���� �� ���
		// ����� �ƴϸ� ����� �ƴմϴ� ���
		// 4 : �ڼ��ڼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	public void practice2() {
		// �� ���� ����� ������ �ݺ�
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.print("���� : ");
			num = sc.nextInt();
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 0) {
						System.out.print("��");
					} else {
						System.out.print("��");
					}
				}
				break;
			} else {
				System.out.println("����� �ƴմϴ�.");
			}
		}
	}
	
	public void practice3() {
		// ���ڿ��� �Է� �ް� ���ڿ����� �˻��� ���ڸ� �Է� �޾�
		// ���ڿ��� �� ���ڰ� �� ���ִ��� ���� ���
		// banana , a,  3
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(str + " �ȿ� ���Ե� " + ch + " ���� : " + count);
	}
	
	public void practice4() {
		// �� ���� �� �Ͻðڽ��ϱ�? ������� n�� ���� ������ �ݺ�
		Scanner sc = new Scanner(System.in);
		
		char answer = ' ';
		do {
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();
			System.out.print("���� : ");
			char ch = sc.nextLine().charAt(0);
			
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.println("���Ե� ���� : " + count);
			
			while(true) {				
				System.out.print("�� �Ͻðڽ��ϱ�? (y/n) : ");
				answer = sc.nextLine().charAt(0);
				if(answer != 'Y' && answer != 'y' && answer != 'n' && answer != 'N') {
					System.out.println("�߸��� ����Դϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				break;
			}
		} while(answer != 'n' && answer != 'N');
	}
	
	public void practice5() {
		// �Ž����� ���󺰷� �� �� �����°�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ݾ� : ");
		int all = sc.nextInt();
		System.out.print("��ǰ ���� : ");
		int price = sc.nextInt();
		int remain = all - price;
		
		
		if(all >= price) {
			int m50000 = remain / 50000;
			int m10000 = (remain % 50000)/10000;
			int m5000 = ((remain % 50000)%10000)/5000;
			int m1000 = (((remain % 50000)%10000)%5000)/1000;
			int m500 = ((((remain % 50000)%10000)%5000)%1000)/500;
			int m100 = (((((remain % 50000)%10000)%5000)%1000)%500)/100;
			int m50 = ((((((remain % 50000)%10000)%5000)%1000)%500)%100)/50;
			int m10 = (((((((remain % 50000)%10000)%5000)%1000)%500)%100)%50)/10;

			System.out.println("5���� : " + m50000);
			System.out.println("1���� : " + m10000);
			System.out.println("5õ�� : " + m5000);
			System.out.println("1õ�� : " + m1000);
			System.out.println("5��� : " + m500);
			System.out.println("1��� : " + m100);
			System.out.println("5�ʿ� : " + m50);
			System.out.println("1�ʿ� : " + m10);
		} else {
			System.out.println("�� ���� �� �ּ���..?");
		}
	}
}
