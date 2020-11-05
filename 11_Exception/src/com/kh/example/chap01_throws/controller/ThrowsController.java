package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1이 호출됨...");
		method2();
		System.out.println("method1 종료됨...");
	}
	
	public void method2() throws Exception {
		System.out.println("method2가 호출됨...");
		method3();
		System.out.println("method2 종료됨...");
	}
	
	public void method3() throws Exception {
		System.out.println("method3이 호출됨...");
		throw new Exception(); // 강제적 예외 발생
//		System.out.println("method3 종료됨...");
//		Unreachable code
//		에러가 발생하면 비정상 종료되어 코드가 존재할 필요가없음
	}
}
