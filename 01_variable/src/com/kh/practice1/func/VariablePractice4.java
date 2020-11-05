package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void practiceMethod() {
		
	// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		
		String str;
		int i;
		
		System.out.println("문자열을 입력하세요 : ");
		str = sc.nextLine();
		
		for(i=0; i<3; i++) {
			System.out.printf("%d 번째 문자 : %c \n", i+1, str.charAt(i));
		}
		
	}
}
