package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	// ��ǻ�Ϳ� ���������� �ϴ� ����
	public void rps() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
//		String userStr = ""; //null�� �ϸ� null.equals�� ���� ������ ������
		int count = 0;
		int win = 0;
		int draw = 0;
		
		while(true) {
			
			int comInt = (int)(Math.random() * 3); // 0, 1, 2
			String comStr = null;
			switch(comInt) {
			case 0: comStr = "����"; break;
			case 1: comStr = "����"; break;
			case 2: comStr = "��"; break;
			}
			
			System.out.print("���������� : ");
			String userStr = sc.nextLine();
			
			
			String result = null;
			String winStr = "�̰���ϴ� !";
			String loseStr = "�����ϴ� �Ф�";
			
			if(userStr.equals("����") || userStr.equals("����") || userStr.equals("��")) {				
				if(comStr.equals(userStr)) {
					result = "�����ϴ�.";
					draw++;
				} else {
					if(comStr.equals("����")) {
						switch(userStr) {
						case "����": result = winStr; win++; break;
						case "��": result = loseStr; break;
						}
					} else if(comStr.equals("����")) {
						if(userStr.equals("��")) {
							result = winStr;
							win++;
						} else {
							result = loseStr;
						}
					} else {
						result = userStr.equals("����") ? winStr : loseStr;
						if(result.equals(winStr)) {
							win++;
						}
					}
				}
//				count++;
			} else if(!userStr.equals("exit")){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			} else {
				break;
			}
			count++;
			System.out.println("��ǻ�� : " + comStr);
			System.out.println(name + " : " + userStr);
			System.out.println(result);
			System.out.println();
		}
		
//		System.out.println(count + "�� " + win + "�� " + draw + "�� " + (count-win-draw) + "��");
		System.out.printf("%d�� %d�� %d�� %d��", count, win, draw, (count-win-draw));
	}
}
