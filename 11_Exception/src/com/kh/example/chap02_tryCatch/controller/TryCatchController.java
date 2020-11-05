package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨");
		try {
			method2();
			System.out.println("예외 발생시에 출력될까? ㄴㄴ catch로 넘어감");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception 으로 잡아줌");
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행");
		}
		System.out.println("method1() 종료됨");
	}

	private void method2() throws IOException {
		System.out.println("method2() 호출됨");
		method3();
		System.out.println("method2() 종료됨");
	}

	private void method3() throws IOException {
		System.out.println("method3() 호출됨");
		throw new IOException("IOException을 강제 발생시킴.ㅋ");
//		System.out.println("method3() 종료됨");
	}
}
