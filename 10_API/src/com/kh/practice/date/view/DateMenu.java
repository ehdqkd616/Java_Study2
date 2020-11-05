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
			System.out.println("1. 디데이 구하기");
			System.out.println("2. 기준 일로부터 N일 째 되는 날 구하기");
			System.out.println("3. 해당 날짜 요일 구하기");
			System.out.println("4. 오늘 날짜 구하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: calcDDay(); break;
			case 2: calcDay(); break;
			case 3: printDate(); break;
			case 4: printToday(); break;
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("없는 메뉴 번호입니다. 다시 입력해주세요.");
			}
		}while(menuNum != 9);
	}
	
	public void calcDDay() {
		System.out.print("오늘 날짜가 계산 날짜에 들어가나요?(y/n) : ");
		String answer = sc.next();
		
		int result = 0;
		if(answer.toUpperCase().equals("Y")) {
			System.out.print("디데이 구할 연도 : ");
			int year = sc.nextInt();
			System.out.print("디데이 구할 월 : ");
			int month = sc.nextInt();
			System.out.print("디데이 구할 일 : ");
			int day = sc.nextInt();
			
			result = dc.calcDDay(year, month, day);
		} else {
			System.out.print("시작일 연도 : ");
			int sYear = sc.nextInt();
			System.out.print("시작일 월 : ");
			int sMonth = sc.nextInt();
			System.out.print("시작일 일 : ");
			int sDay = sc.nextInt();
			
			System.out.print("종료일 연도 : ");
			int eYear = sc.nextInt();
			System.out.print("종료일 월 : ");
			int eMonth = sc.nextInt();
			System.out.print("종료일 일 : ");
			int eDay = sc.nextInt();
			
			result = dc.calcDDay(sYear, sMonth, sDay, eYear, eMonth, eDay);
		}
		
		System.out.println(result + "일");
	}
	
	public void calcDay() {
		System.out.print("기준일 연도 : ");
		int year = sc.nextInt();
		System.out.print("기준일 월 : ");
		int month = sc.nextInt();
		System.out.print("기준일 일 : ");
		int day = sc.nextInt();
		System.out.print("계산할 N일 : ");
		int num = sc.nextInt();
		
		Date d = dc.calcDay(year, month, day, num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 E요일입니다.");
		String result = sdf.format(d);
		System.out.println(result);
	}
	
	public void printDate() {
		System.out.print("연도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		String result = dc.printDate(year, month, day);
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + result + "입니다.");
	}
	
	public void printToday() {
		System.out.println("오늘은 " + dc.printToday() + "입니다.");
	}
}
