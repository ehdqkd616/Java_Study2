package com.kh.practice.date.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.kh.practice.date.controller.DateController;

public class DateMenu {
	private Scanner sc = new Scanner(System.in);
	private DateController dc = new DateController();
	
	public void mainMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("1. ���� ���ϱ�");
			System.out.println("2. ���� �Ϸκ��� N�� ° �Ǵ� �� ���ϱ�");
			System.out.println("3. �ش� ��¥ ���� ���ϱ�");
			System.out.println("4. ���� ��¥ ���ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: calcDDay(); break;
			case 2: calcDay(); break;
			case 3: printDate(); break;
			case 4: printToday(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("���� �޴� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
		}while(menuNum != 9);
	}
	
	public void calcDDay() {
		System.out.print("���� ��¥�� ��� ��¥�� ������?(y/n) : ");
		String answer = sc.next();
		
		int result = 0;
		if(answer.toUpperCase().equals("Y")) {
			System.out.print("���� ���� ���� : ");
			int year = sc.nextInt();
			System.out.print("���� ���� �� : ");
			int month = sc.nextInt();
			System.out.print("���� ���� �� : ");
			int day = sc.nextInt();
			
			result = dc.calcDDay(year, month, day);
		} else {
			System.out.print("������ ���� : ");
			int sYear = sc.nextInt();
			System.out.print("������ �� : ");
			int sMonth = sc.nextInt();
			System.out.print("������ �� : ");
			int sDay = sc.nextInt();
			
			System.out.print("������ ���� : ");
			int eYear = sc.nextInt();
			System.out.print("������ �� : ");
			int eMonth = sc.nextInt();
			System.out.print("������ �� : ");
			int eDay = sc.nextInt();
			
			result = dc.calcDDay(sYear, sMonth, sDay, eYear, eMonth, eDay);
		}
		
		System.out.println(result + "��");
	}
	
	public void calcDay() {
		System.out.print("������ ���� : ");
		int year = sc.nextInt();
		System.out.print("������ �� : ");
		int month = sc.nextInt();
		System.out.print("������ �� : ");
		int day = sc.nextInt();
		System.out.print("����� N�� : ");
		int num = sc.nextInt();
		
		Date d = dc.calcDay(year, month, day, num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� mm�� dd�� E�����Դϴ�.");
		String result = sdf.format(d);
		System.out.println(result);
	}
	
	public void printDate() {
		System.out.print("���� : ");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int month = sc.nextInt();
		System.out.print("�� : ");
		int day = sc.nextInt();
		
		String result = dc.printDate(year, month, day);
		System.out.println(year + "�� " + month + "�� " + day + "���� " + result + "�Դϴ�.");
	}
	
	public void printToday() {
		System.out.println("������ " + dc.printToday() + "�Դϴ�.");
	}
}
