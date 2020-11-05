package com.kh.operator;

public class D_Comparison {
	// 비교 연산자
	// 두 개의 데이터의 관계를 따지는 연산자
	// 조건을 만족하면 true, 만족하지 못하면 false 반환
	// <	a < b : a가 b보다 작은가? (a가 b보다 작으면 true 반환)
	// >	a > b : a가 b보다 큰가? (a가 b보다 크면 true 반환)
	// <=	a <= b : a가 b보다 작거나 같은가?
	// >=	a >= b : a가 b보다 크거나 같은가?
	// ==	a == b : a와 b는 같은가?
	// !=	a != b : a와 b는 다른가?
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		// 변수 선언
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1 = (a == b);
		result2 = (a <= b);
		result3 = (a > b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		// b가 짝수인가
		System.out.println("b가 짝수인가? " + (b % 2 == 0));
		// b가 홀수인가
		System.out.println("b가 홀수인가? " + (b % 2 == 1));
		System.out.println("b가 홀수인가? " + (b % 2 != 0));
		
	}
	
}
