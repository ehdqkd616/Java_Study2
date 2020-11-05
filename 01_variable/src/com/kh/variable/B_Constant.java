package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		//메소드 기능 구현
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("변수 age 값 : "+age);
		System.out.println("상수 AGE 값 : "+AGE);
		
		// 20으로 되어 있는 값을 30으로 변경
		age = 30;
		// AGE = 30;
		// The final local variable AGE may already have been assigned
		
		System.out.println("변수 age 값 : "+age);
		System.out.println("상수 AGE 값 : "+AGE);
		
	}

}
