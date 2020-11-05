package com.kh.variable;

public class D_Cast {
	public void rule1() {
		
		int num = 'A'; // 자동 형변환
		// char는 유니코드로 저장 (정수 값 저장)
		System.out.println("num의 유니코드 값 : " + num);
		// char는 유니코드로 저장 (정수 값 저장)
		
		char ch = 97; // 자동 형변환
		System.out.println("ch : " + ch);
		
//		char ch2 = num;
//		Type mismatch : cannot convert from int to char		
		char ch2 = (char)num;
		System.out.println("num의 char 변환 값 : " + ch2);
		
		int num2 = -97;
		
//		char ch3 = num2;
		char ch3 = (char)num2;
		System.out.println("num2의 char 변환 값 : " + ch3);
	}
	
	public void rule2() {
		
		int iNum = 10;
		long lNum = 100;
		
		// int sum = iNum + lNum;
		// 연산은 큰 자료형으로 자동 형변환 후 연산처리가 되기 때문에 iNum이 long형으로 바뀌고
		// long형 + long형으로 결과까지 long형으로 되었음
		// long형의 결과 값은 int형에 담길 수 없으므로 컴파일 에러
		
//		int sum1 = iNum + lNum;
		// 해결 1. 수행 과제를 int로 강제 형변환 
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// 해결 2. long형을 int로 강제 형변환
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// 해결 3. long형으로 자료형을 받음
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
		
	}
	
		
}
