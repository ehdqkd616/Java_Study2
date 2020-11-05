package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int menu = 0;
		do {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: circleMenu(); break;
			case 2: rectangleMenu(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
			}
		} while(menu != 9);
	}
	
	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: calcCircum(); break;
		case 2: calcCircleArea(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}		
	}
	
	public void rectangleMenu() {
		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: calcPerimeter(); break;
		case 2: calcRectArea(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}
	}
	
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int r = sc.nextInt();
		
		System.out.println("�ѷ� : " + cc.calcCircum(x, y, r));
	}
	
	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int r = sc.nextInt();
		
		System.out.println("���� : " + cc.calcArea(x, y, r));
	}
	
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		
		System.out.println("�ѷ� : " + rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		
		System.out.println("���� : " + rc.calcArea(x, y, height, width));
	}
}
