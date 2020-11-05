package com.kh.operator;

public class B_InDecrease {
	// 증감 연산자 : ++, --
	// 1씩 증가하거나 감소하는 연산자
	// 위치에 따라서 전위 연산자 혹은 후위 연산자로 나뉨
	
	public void method1() {
		// 전위 증감 연산자 테스트
		int num1 = 10;
		System.out.println("전위 증감 연산자 적용 전 : " + num1);
		System.out.println("++num1을 1회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 2회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 3회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 4회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 5회 수행 후 결과 : " + (++num1));
		System.out.println("전위 증감 연산자 적용 후 : " + num1);
		
		// 후위 증감 연산자 테스트
		int num2 = 10;

		System.out.println("전위 증감 연산자 적용 전 : " + num2);
		System.out.println("num2++을 1회 수행 후 결과 : " + (num2++));
		System.out.println("num2++을 2회 수행 후 결과 : " + (num2++));
		System.out.println("num2++을 3회 수행 후 결과 : " + (num2++));
		System.out.println("num2++을 4회 수행 후 결과 : " + (num2++));
		System.out.println("num2++을 5회 수행 후 결과 : " + (num2++));
		System.out.println("후위 증감 연산자 적용 후 : " + num2);
		
	}
	
	public void method2() {
		
		int age = 20;
		
		System.out.println("age--는? " + age--); // 21 --> 20
		System.out.println("현재 나이는 ? " + age); // 20
		
	}
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		System.out.println("result1 : " + result1);
		System.out.println("num1 : " + num1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
	}
	
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);
		System.out.println((++a) + (b++));
		System.out.println((a++) + (--b) + (--c));
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
	}
	
	
}
