package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void practiceMethod() {
		
		// 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age = 0;
		double height;
		char gender;
		
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.println("나이를 입력하세요 : ");
		try { 
			age = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.printf("키 %3.1f인 %c자 %s님 반갑습니다^^ \n", height, gender, age, name);
	}
	
}
