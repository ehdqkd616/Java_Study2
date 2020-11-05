package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		// 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
		// 홀수면 박, 짝수면 수 출력
		// 양수가 아니면 양수가 아닙니다 출력
		// 4 : 박수박수
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void practice2() {
		// 위 문제 양수일 때까지 반복
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				break;
			} else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}
	
	public void practice3() {
		// 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아
		// 문자열에 그 문자가 몇 개있는지 개수 출력
		// banana , a,  3
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);
	}
	
	public void practice4() {
		// 위 문제 더 하시겠습니까? 물어봐서 n이 나올 때까지 반복
		Scanner sc = new Scanner(System.in);
		
		char answer = ' ';
		do {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			
			while(true) {				
				System.out.print("더 하시겠습니까? (y/n) : ");
				answer = sc.nextLine().charAt(0);
				if(answer != 'Y' && answer != 'y' && answer != 'n' && answer != 'N') {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
				break;
			}
		} while(answer != 'n' && answer != 'N');
	}
	
	public void practice5() {
		// 거스름돈 지폐별로 몇 장 나오는가
		
		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액 : ");
		int all = sc.nextInt();
		System.out.print("상품 가격 : ");
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

			System.out.println("5만원 : " + m50000);
			System.out.println("1만원 : " + m10000);
			System.out.println("5천원 : " + m5000);
			System.out.println("1천원 : " + m1000);
			System.out.println("5백원 : " + m500);
			System.out.println("1백원 : " + m100);
			System.out.println("5십원 : " + m50);
			System.out.println("1십원 : " + m10);
		} else {
			System.out.println("왜 돈을 덜 주세요..?");
		}
	}
}
