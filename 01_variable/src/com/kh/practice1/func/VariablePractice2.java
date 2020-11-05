package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practiceMethod() {
		
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("첫 번째 정수 : ");
		a = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		b = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", a+b);
		System.out.printf("빼기 결과 : %d\n", a-b);
		System.out.printf("곱하기 결과 : %d\n", a*b);
		System.out.printf("나누기 결과 : %d\n", a/b);
	}
	
}
