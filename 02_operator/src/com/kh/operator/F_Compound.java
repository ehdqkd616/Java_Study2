package com.kh.operator;

public class F_Compound {
	// 복합 대입 연산자 : 다른 연산자와 대입연산자를 함께 사용하는 연산자
	// 연산 처리 속도가 훨씬 빠르므로 권장함
	
	public void method() {
		int num = 12;
		
		System.out.println("num : " + num);
		
		//num = num + 3;
		num += 3;
		System.out.println("num : " + num);
		
		num -= 3;
	}
	
	
}
